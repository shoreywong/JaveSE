package day0207;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("���ʣ�");
		double s = 
		 new Scanner(System.in).nextDouble();
		
		//���s������3500������˰
		if(s <= 3500) {
			System.out.println("���ý�˰");
			//����ִ�е��˽�����������벻��ִ��
			return;
		}
		
		//����s���ٵ�3500
		s -= 3500; //s = s-3500
		
		//˰�ʱ���r������۳�������k
		double r=0;
		int k=0;
		
		//����s�ķ�Χ����ȷ��˰�ʺ�����۳���
		if(s<=1500) {
			r=0.03;
			k=0;
		} else if(s<=4500) {
			r=0.1;
			k=105;
		} else if(s<=9000) {
			r=0.2;
			k=555;
		} else if(s<=35000) {
			r=0.25;
			k=1005;
		} else if(s<=55000) {
			r=0.3;
			k=2755;
		} else if(s<=80000) {
			r=0.35;
			k=5505;
		} else {
			r=0.45;
			k=13505;
		}
		
		double tax = s*r - k;
		System.out.println("��������˰��"+tax);   
	}
}



