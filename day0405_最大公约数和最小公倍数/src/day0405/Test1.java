package day0405;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����a:");
		int a = new Scanner(System.in).nextInt();
		System.out.print("����b:");
		int b = new Scanner(System.in).nextInt();
		
		/*
		 * a��b��ֵ�����ݵ�f1()����
		 * �ٵõ������ķ���ֵ���浽����zdgys
		 * 
		 * a��b��ֵ�����ݵ�f2()����
		 * �ٵõ������ķ���ֵ���浽����zxgbs
		 */
		int zdgys = f1(a, b);
		long zxgbs = f2(a, b);
		System.out.println("���Լ����"+zdgys);
		System.out.println("��С��������"+zxgbs);
	}
	
	static int f1(int a, int b) {
		//��a,b��Сֵ
		int min = a<b?a:b;
		//��min��ǰ�����ܰ�a,bͬʱ������ֵ
		for(int i=min; i>=1; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		//�߼��ϲ�����ִ�У�Ŀ�����ñ������ͨ��
		return 1;
	}
	
	static long f2(int a, int b) {
		//�õ�a,b�����ֵ
		int max = a>b? a:b;
		//��max��ʼ�����ܱ�a,bͬʱ������ֵ
		for(long i=max; ;i+=max) {
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
	
}








