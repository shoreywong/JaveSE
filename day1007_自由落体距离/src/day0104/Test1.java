package day0104;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("���뽵��ʱ�䣨�룩��");
		/*
		 * �Ȼ�������ֵ
		 * �ٴ浽����t
		 */
		double t = 
		 new Scanner(System.in).nextDouble();
		
		//�׹�ʽ�������
		//�ٰѼ��������浽����d
		//double d = 0.5*9.8*t*t;
		
		BigDecimal bd1 = BigDecimal.valueOf(4.9);
		BigDecimal bd2 = BigDecimal.valueOf(t);
		double d = 
				bd1
				.multiply(bd2.pow(2))
				.setScale(3, BigDecimal.ROUND_HALF_UP) //��������
				.doubleValue();
		
		
		
		//��ӡ���
		System.out.println(t+"�뽵����"+d+"��");
	}
}




