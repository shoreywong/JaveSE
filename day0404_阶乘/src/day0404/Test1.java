package day0404;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("������������׳ˣ�");
		int n = new Scanner(System.in).nextInt();
		
		/*
		 * ��n��ֵ�����ݵ�f()�����������㣬
		 * �ٵõ������ķ���ֵ��
		 * ���浽���� r
		 */
		long r = f(n);
		System.out.println(r);
	}
	
	static long f(int n) {//5
		/*
		 * long r = 5
		 * 
		 * iѭ��
		 * 4, r=r*i
		 * 3, r=r*i
		 * 2, r=r*i
		 * 1, r=r*i
		 */
		
		//r��n��ʼ
		long r = n;
		//i��n-1��1�ݼ�
		for(int i=n-1; i>=1; i--) {
			r *= i; //r=r*i;
		}
		
		return r;
	}
	
	
}




