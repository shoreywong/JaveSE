package day1404;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("����ļ����Ŀ¼��");
		String s1 = new Scanner(System.in).nextLine();
		File dir = new File(s1);
		if(! dir.isDirectory()) {
			System.out.println("�����ļ���");
			return;
		}
		
		
		System.out.println("�ϲ���Ŀ���ļ���");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println("�������ļ���");
			return;
		}
		
		try {
			heBing(dir, to);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
		
		
	}

	private static void heBing(
			File dir, File to) throws Exception{
		//��dirĿ¼�б�
		File[] files = list(dir);
		//�����
		FileOutputStream out = new FileOutputStream(to);
		FileInputStream in;
		byte[] buff = new byte[8192];
		int n;//ÿһ��������
		
		//�����ļ��б�
		for (File f : files) {
			in = new FileInputStream(f);
			while((n = in.read(buff)) != -1) {
				out.write(buff,0,n);
			}
			in.close();
		}
		out.close();
	}

	private static File[] list(File dir) {
		File[] files = dir.listFiles();
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				String n1 = o1.getName();
				String n2 = o2.getName();
				// xxx.xx.23 --> 23
				n1 = n1.substring(n1.lastIndexOf(".")+1);
				n2 = n2.substring(n2.lastIndexOf(".")+1);
				int a = Integer.parseInt(n1);
				int b = Integer.parseInt(n2);
				return a-b;				
			}
		});
		return files;
	}
}





