package day1302;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;

		path = "D:\\home\\java\\eclipse\\eclipse.exe";//���ڵ��ļ�
		//path = "D:/home/java/eclipse";//���ڵ��ļ���
		//path = "k:/fdfdf/dfd/fd";//�����ڵ�·��

		File f = new File(path);
		System.out.println(f.exists());//�Ƿ����
		System.out.println(f.getName());//�ļ���
		System.out.println(f.getParent());//���ļ���
		System.out.println(f.getAbsolutePath());//����·��
		System.out.println(f.lastModified());//����޸�ʱ��
		System.out.println(f.length());//�ֽ���,���ļ�����Ч
		System.out.println(f.isFile());//�Ƿ����ļ�
		System.out.println(f.isDirectory());//�Ƿ����ļ���
	}
}





