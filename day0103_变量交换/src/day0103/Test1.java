package day0103;

//������ָ��·������������У����Լ�д����
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��������a��");
		/*
		 * �Ȼ�������ֵ
		 * �ٱ��浽����a
		 */
		int a = new Scanner(System.in).nextInt();
		
		System.out.print("��������b��");
		int b = new Scanner(System.in).nextInt();
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}



