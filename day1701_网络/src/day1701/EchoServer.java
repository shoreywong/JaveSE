package day1701;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void start() {
		//���������߳�
		new Thread() {
			@Override
			public void run() {
				try {
					//��������
					ServerSocket ss = 
					 new ServerSocket(8000);
					System.out.println("����������");    
					
					while(true) {
						Socket s = ss.accept();
						//��Socket����ͨ������ͨ���߳�ȥִ��ͨ�Ų���
						TongXinThread t = new TongXinThread(s); 
						t.start();
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
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			try {
				/*
				 * ͨ��Э��
				 *     *) ͨ��ִ������
				 *        ѭ���ӿͻ��˽������ݣ�
				 *        �յ������ݣ��ٷ��ؿͻ���
				 *        
				 *     *) ���ݸ�ʽ
				 *        UTF-8������ַ���
				 *        ÿһ����β��Ҫ��һ�����з�
				 * 
				 * BR--ISR--����������
				 * PW--OSW--���������
				 */
				BufferedReader in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(),"UTF-8"));
				
				PrintWriter out = 
				 new PrintWriter(
				 new OutputStreamWriter(
				 s.getOutputStream(),"UTF-8"));
				
				String line;
				while((line = in.readLine()) != null) {
					out.println(line);
					out.flush();
				}
				//�Ͽ�
			} catch (Exception e) {
				//�Ͽ�
			}
			
			System.out.println("�ͻ��˶Ͽ�����");
		}
		
	}
	
	
	public static void main(String[] args) {
		EchoServer s = new EchoServer();
		s.start();
	}
	
}





