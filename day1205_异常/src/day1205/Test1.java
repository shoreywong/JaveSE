package day1205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		while(true) {
			try {
				f1();
				break;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("����������������");
			} catch (ArithmeticException e) {
				System.out.println("����������0");
			} catch (Exception e) {
				System.out.println("����������");
			} finally {
				System.out.println("\n----------------");
			}
		}
	}

	private static void f1() {
		System.out.println("���붺�Ÿ���������������");
		// "45345,654" --> ["45345", "654"]
		String s = new Scanner(System.in).nextLine();
		String[] a = s.split(",");
		int n1 = Integer.parseInt(a[0]);
		int n2 = Integer.parseInt(a[1]);
		int r = n1/n2;
		System.out.println(r);
		/*
		 * 2342,43    
		 * 343
		 * abc,def
		 * 345345,0
		 */
	}
}








