package day1701;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception {
		//ѡ��һ���˿ڣ���������
		//�˿��������������ռ�ã������
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("����������");
		
		//�ȴ��ͻ��˷������ӣ�����������ͨ��
		Socket s = ss.accept();
		
		//������ͨ�������˫�����
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * ͨ��Э��
		 *     *)ͨ�Ų���
		 *     		1.��������
		 *     		2.��������
		 *     *)ͨ�����ݸ�ʽ
		 *     		1.����Hello���Ӣ���ַ�
		 *     		2.����world���Ӣ���ַ�
		 */
		for(int i=0;i<5;i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		System.out.println("\n\n---------------");
		
		out.write("world".getBytes());
		out.flush();
		
		s.close();//�Ͽ�����
		ss.close();//ֹͣ�����ͷŶ˿�
	}
}








