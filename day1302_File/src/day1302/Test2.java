package day1302;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * �½��ļ���d:\abc\aa
		 * 
		 * �½��ļ�d:\abc\aa\a.txt
		 * 
		 * ɾ���ļ�d:\abc\aa\a.txt
		 * 
		 * ɾ���ļ���d:\abc\aa
		 */
		System.out.println("���س�ִ��");
		
		new Scanner(System.in).nextLine();
		File dir = new File("d:/abc/aa");
		dir.mkdirs();
		
		new Scanner(System.in).nextLine();
		File f = new File("d:/abc/aa/a.txt");
		f.createNewFile();
		
		new Scanner(System.in).nextLine();
		f.delete();
		
		new Scanner(System.in).nextLine();
		dir.delete();
		
		
	}
}


