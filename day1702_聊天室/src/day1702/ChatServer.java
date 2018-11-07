package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private List<TongXinThread> list = 
			new ArrayList<>();
	
	public void start() {
		//���������߳�
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = 
					 new ServerSocket(8000);
					System.out.println("�����ҷ�����������");
					while(true) {
						Socket s = ss.accept();
						TongXinThread t = 
						 new TongXinThread(s);
						t.start();
						synchronized (list) {
							list.add(t);
						}
					}
				} catch (Exception e) {
					System.out.println(
					 "�����޷��������������ֹͣ");
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	
	class TongXinThread extends Thread {
		Socket s;
		BufferedReader in;
		PrintWriter out;
		String name;
		
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		
		public void sendAll(String msg) {
			synchronized (list) {
				for (TongXinThread t : list) {
					t.send(msg);
				}
			}
		}
		
		@Override
		public void run() {
			try {
				in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(),"UTF-8"));
				
				out = 
				 new PrintWriter(
				 new OutputStreamWriter(
				 s.getOutputStream(),"UTF-8"));       
				
				//�Ƚ��տͻ��˵��ǳ�
				name = in.readLine();
				//���ͻ�ӭ��Ϣ
				send(name+"����ӭ�������������ң�");
				//Ⱥ��������Ϣ
				synchronized (list) {
					sendAll(name+"�����������ң�����������"+list.size());   
				}
				
				s.setSoTimeout(3000);
				int count = 0;
				
				String line;
				while(true) {
					try {
						line = in.readLine();
						if(line == null) {
							break;
						}
						sendAll(name+"˵��"+line);
						count = 0;
					} catch (SocketTimeoutException e) {
						count++;
						if(count == 4) {
							send("*** ���Ѿ����߳�������");
							s.close();
							break;
						}
						send("*** ���棺������������� ("+count+"/3)");
					}
					
				}
			} catch (Exception e) {
			}
			synchronized (list) {
				//�Ƴ���ǰͨ���̶߳���
				list.remove(this);
				//Ⱥ��������Ϣ
				sendAll(name+"�뿪�������ң�����������"+list.size());   
			}
		}
	}
	
	
	public static void main(String[] args) {
		ChatServer s = new ChatServer();
		s.start();
	}
	
	
}









