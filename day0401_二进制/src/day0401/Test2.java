package day0401;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("���������֣�");
		String s = 
		 new Scanner(System.in).nextLine();
		
		/*
		 * Integer.parseInt("1010", 2)
		 * �Զ����ƣ������������ַ���
		 */
		int a = Integer.parseInt(s, 2);
		System.out.println("ʮ���ƣ�"+a);
	}
}




