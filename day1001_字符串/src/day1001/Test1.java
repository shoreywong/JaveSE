package day1001;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * ����email��ַ����ȡ���ֲ���
		 * "abc@def.com"
		 *  abc
		 */
		System.out.println("email:");
		String e = new Scanner(System.in).nextLine();
		String name = getName(e);
		System.out.println(name);
	}

	private static String getName(String e) {
		//����e�ַ�����ȥ�����˿հ��ַ����ٴ浽����e
		e = e.trim();
		//��e�в����Ӵ� "@"��λ���±�浽 index
		int index = e.indexOf("@");
		//��� "@" �����ڣ����� "��ʽ����"
		if(index == -1) {
			return "��ʽ����";
		}
		//�� e ��ȡ [0, index) �Ӵ�
		String n = e.substring(0, index);
		//���ؽ�ȡ���Ӵ�
		return n;
	}
}





