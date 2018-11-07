package day1504;

import java.io.File;
import java.util.LinkedList;
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
		//�½�LinkedList
		LinkedList<File> list = 
				new LinkedList<>();
		//dir��ӵ�list
		list.add(dir);
		
		//�ļ���С�ۼӱ��� sum
		long sum = 0;
		
		//�����ϲ��ǿռ���
		while(list.size() != 0) {
			File f = list.removeFirst();
			if(f.isFile()) {
				sum += f.length();
			} else {
				//f���ļ��У�չ���б�ȫ������listͷ��
				File[] files = f.listFiles();
				for (File f2 : files) {
					list.addFirst(f2);
				}
			}
		}
		return sum;
	}
}






