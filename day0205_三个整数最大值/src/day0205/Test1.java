package day0205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����a:");
		int a = new Scanner(System.in).nextInt();
		System.out.print("����b:");
		int b = new Scanner(System.in).nextInt();
		System.out.print("����c:");
		int c = new Scanner(System.in).nextInt();
		
		//a,b�����ֵ���浽max
		//int max = a>b ? a : b;
		//max,c�����ֵ���浽max
		//max = max>c ? max : c;
		
		int max = a>b? (a>c?a:c) : (b>c?b:c);
		
		System.out.println("���ֵ��"+max);
	}
}
