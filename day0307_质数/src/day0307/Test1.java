package day0307;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����������");
		int n = new Scanner(System.in).nextInt();
		
		f(n);
	}
	
	static void f(int n) {
		if(n==2) {
			System.out.println("������");
			return;
		}
		if(n<2) {
			System.out.println("��������");
			return;
		}
		
		/*
		 * n�Ƿ�������
		 * 
		 * ��2��<n����+1�����ܰ�n������ֵ��
		 * �ҵ���n��������
		 * �������е�ֵ���Ҳ�����n������
		 */
		
		//n����+1���浽����max
		double max = Math.sqrt(n) + 1;
		
		//��һ����ǣ�����������
		boolean flag = true;		
		//2��<max
		for(int i=2; i<max; i++) {
			//n��i����
			if(n%i == 0) {
				System.out.println("��������");
				flag = false;//��������
				break;
			}
		}
		//���flag������ֵ��true
		if(flag) {
			System.out.println("������");
		}
	}
}






