package day1701;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	public static void main(String[] args) throws Exception {
		//�ͻ���Socket
		Socket s = 
		 new Socket("127.0.0.1", 8000);
		
		//ȡ��˫�����
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * 1. ����Hello
		 * 2. ����world
		 */
		
		System.out.println("�����������Hello");
		out.write("Hello".getBytes());
		out.flush();
		System.out.println("������ɣ�");
		System.out.println("\n\n---------------");
		
		System.out.println("�ӷ���������");
		for(int i=0;i<5;i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		System.out.println("������ϣ�");
		
		s.close();//�Ͽ�����
		
		
	}
}






