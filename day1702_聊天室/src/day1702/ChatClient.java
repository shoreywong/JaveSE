package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatClient {
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	
	private LinkedList<String> list = new LinkedList<>();
	private boolean inputFlag = false;
	
	
	public void start() {
		try {
			s = new Socket("192.168.14.100", 8000);
			in = 
			 new BufferedReader(
			 new InputStreamReader(
			 s.getInputStream(),"UTF-8"));
			
			out = 
			 new PrintWriter(
			 new OutputStreamWriter(
			 s.getOutputStream(),"UTF-8"));
			
			System.out.println("�Ѿ����ӷ�����");
			System.out.print("�����ǳƣ�");
			String name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			
			//�����������ݵ��߳�
			new Thread() {
				@Override
				public void run() {
					input();
				}
			}.start();
			
			//���շ��������ݵ��߳�
			new Thread() {
				@Override
				public void run() {
					receive();
				}
			}.start();
			
			//��ӡ�߳�
			new Thread() {
				@Override
				public void run() {
					print();
				}
			}.start();
			
			
		} catch (Exception e) {
			System.out.println("�޷����ӷ�����");
		}
	}

	protected void print() {
		while(true) {
			synchronized (list) {
				//û�����ݣ������û��������룬
				//��ͣ�ȴ�
				while(list.size()==0 || inputFlag) {
					try {
						list.wait();
					} catch (InterruptedException e) {
					}
				}
				String str = list.removeFirst();
				System.out.println(str);
			}
		}
	}

	protected void receive() {
		try {
			String line;
			while((line = in.readLine()) != null) {
				synchronized (list) {
					list.add(line);
					list.notifyAll();
				}
			}
		} catch (Exception e) {
		}
		
		System.out.println("�Ѿ���������Ͽ�����");
	}

	protected void input() {
		System.out.println("���س�������������");
		
		while(true) {
			new Scanner(System.in).nextLine();
			inputFlag = true;			
			
			System.out.print("�����������ݣ�");
			String s = new Scanner(System.in).nextLine();
			out.println(s);
			out.flush();
			
			inputFlag = false;

			synchronized (list) {
				list.notifyAll();
			}
		}
	}
	
	
	public static void main(String[] args) {
		ChatClient c = new ChatClient();
		c.start();
	}
}







