package day1506;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
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
		
		System.out.print("ԭ�ļ����룺");
		String fromCharset = new Scanner(System.in).nextLine();
		System.out.print("Ŀ���ļ����룺");
		String toCharset = new Scanner(System.in).nextLine();
		
		try {
			copy(from,to,fromCharset,toCharset);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
		
	}

	private static void copy(
			File from, 
			File to,
			String fromCharset,
			String toCharset) throws Exception {
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream(from), fromCharset);
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream(to), toCharset);
		
		char[] buff = new char[8192];
		int n;
		while((n=in.read(buff)) != -1) {
			out.write(buff,0,n);
		}
		in.close();
		out.close();
	}
}





