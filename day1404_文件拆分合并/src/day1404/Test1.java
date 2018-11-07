package day1404;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * d:/abc/a.jpg
		 * [d:/abc/a.jpg_split]
		 *         a.jpg.1
		 *         a.jpg.2
		 *         a.jpg.3
		 *         a.jpg.4
		 */
		System.out.println("Ҫ��ֵ��ļ���");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("�����ļ�");
			return;
		}
		
		System.out.println("����ļ��Ĵ�С��Kb����");
		long size = new Scanner(System.in).nextLong();
		size *= 1024; // Kb --> byte
		
		try {
			split(from, size);
			System.out.println("���");
		} catch (Exception e) {
			System.out.println("ʧ��");
			e.printStackTrace();
		}
	}

	private static void split(File from, long size) throws Exception {
		//׼���ļ���
		File dir = zbwjj(from);
		//System.out.println(dir.getAbsolutePath());
		//ԭ�ļ���
		String name = from.getName();
		
		long byteCount=0;//�ֽڼ���
		int fileCount=0;//�ļ�����		
		BufferedInputStream in =
				new BufferedInputStream(
				new FileInputStream(from));
		BufferedOutputStream out = null;		
		int b;
		while((b = in.read()) != -1) {
			//û������������ļ�����
			if(out == null || byteCount==size) {
				if(byteCount==size) {
					out.close();//�ر�ǰһ�������
				}
				out =
				  new BufferedOutputStream(
				  new FileOutputStream(
				  new File(dir, name+"."+(++fileCount))));
				byteCount=0;
			}
			out.write(b);
			byteCount++;
		}
		in.close();
		out.close();
		
	}

	private static File zbwjj(File from) {
		File dir = new File(
			from.getAbsoluteFile()+"_split");
		if(! dir.exists()) {//�ļ��в�����
			dir.mkdirs();//�½��ļ���
		} else {
			clean(dir);//����ļ���
		}
		return dir;
	}

	private static void clean(File dir) {
		File[] files = dir.listFiles();
		for (File f : files) {
			if(f.isFile()) {
				f.delete();//ɾ���ļ�f
			} else {
				clean(f);//����ļ���f
				f.delete();//ɾ���ļ���f
			}
		}
	}
}








