package day1402;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("ԭ�ļ���");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("����Ĳ����ļ�");
			return;
		}
		
		System.out.println("Ŀ���ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println(
			 "���������ļ��У��������ļ�");
			return;
		}
		
		try {
			copy(from, to);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();//��ӡ�쳣
		}
			
	}

	private static void copy(
			File from, File to) throws Exception {
		/*
		 * FIS--from
		 * FOS--to
		 */
		FileInputStream in = 
			new FileInputStream(from);
		FileOutputStream out = 
			new FileOutputStream(to);
		
		//���ֽڶ�ȡ��׼��ʽ
		//int b;
		//while((b=in.read()) != -1) {
		//	out.write(b);
		//}
		
		//������д�����Ч��
		//8192, 8k
		byte[] buff = new byte[8192];
		int n;//ÿһ��������
		while((n=in.read(buff)) != -1) {
			out.write(buff, 0, n);
		}
		
		
		in.close();
		out.close();
	}
}





