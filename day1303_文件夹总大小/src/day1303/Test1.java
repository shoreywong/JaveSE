package day1303;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�ļ��У�");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ����ļ���");
			return;
		}
		
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		File[] files = dir.listFiles();
		if(files == null) {
			return 0;
		}
		long sum = 0;//�ۼӱ���
		for (File f : files) {
			if(f.isFile()) {//f���ļ�
				sum += f.length();
			} else {//f���ļ���
				//�ݹ���f�ļ��д�С
				sum += dirLength(f);
			}
		}
		return sum;
	}
}








