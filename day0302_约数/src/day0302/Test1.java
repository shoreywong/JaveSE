package day0302;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��������");
		int n = new Scanner(System.in).nextInt();
		f(n);
	}
	
	static void f(int x) {
		/*
		 * x��Լ��
		 * 
		 * *)iѭ����1��<=x
		 *     *)���x�ܱ�i����
		 *         *)��ӡi��ֵ
		 */
		for(int i=1; i<=x; i++) {
			if(x%i == 0) {
				System.out.println(i);
			}
		}
	}
	
}







