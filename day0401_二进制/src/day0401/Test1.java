package day0401;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������");
		int a = new Scanner(System.in).nextInt();
		
		/*
		 * Integer.toBinaryString(int)
		 * ��int������ת�ɶ����������ַ���
		 */
		String s = Integer.toBinaryString(a);
		System.out.println("�����ƣ�"+s);
		
		s = Integer.toHexString(a);
		System.out.println("ʮ�����ƣ�"+s);
	}
}



