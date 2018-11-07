package day1304;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("����Ҫɾ�����ļ��У����ɻָ�����");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("����Ĳ����ļ���");
			return;
		}
		
		boolean b = deleteDir(dir);
		if(b) {
			System.out.println("ɾ���ɹ�");
		} else {
			System.out.println("ɾ��ʧ��");
		}
	}

	private static boolean deleteDir(File dir) {
		//�б�
		File[] files = dir.listFiles();
		if(files == null) {
			//�б��в�����������ɾ��Ŀ¼
			return dir.delete();
		}
		//����ɾ�����ļ������ļ���
		for (File f : files) {
			if(f.isFile()) {
				//�м�һ���ļ�ɾ��ʧ��
				if(! f.delete()) {
					return false;//��������ֹͣ��Ŀ¼ɾ��ʧ��
				}
			} else {
				if(! deleteDir(f)) {
					return false;
				}
			}
		}
		//ɾ��dir�ļ���
		return dir.delete();
	}
}







