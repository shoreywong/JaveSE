package day1301;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		/*
		 * 36.4363
		 * 3.63
		 * 
		 * 36.4363/3.63
		 */
		System.out.println("����������������");
		double a = new Scanner(System.in).nextDouble();  
		double b = new Scanner(System.in).nextDouble();  
		try {
			double r = divide(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(
				"���ܳ��㣬�����ǵĴ���������ǰɣ�");
			e.printStackTrace();//��ӡ�쳣��Ϣ
		}
	}
	private static double divide(double a, double b) {
		if(b == 0) {
			ArithmeticException e = 
			 new ArithmeticException("/ by zero");
			throw e;
		}
		return a/b;
	}
}








