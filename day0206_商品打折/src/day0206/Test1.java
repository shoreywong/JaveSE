package day0206;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����ԭ�ۣ�");
		double p = 
		 new Scanner(System.in).nextDouble();
		
		//�ۿ۱���r��Ĭ��ֵ 1
		double r = 1;
		
		//����ԭ��p��ֵ����r��ֵ
		if(p>=5000) {
			r=0.7;
		} else if(p>=2000) {
			r=0.8;
		} else if(p>=1000) {
			r=0.85;
		} else if(p>=500) {
			r=0.9;
		}
		
		p *= r; //p = p*r;
		System.out.println("ʵ�ʼ۸�"+p);
	}
}





