package day0402;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 10����ֵ��ת��2�����ַ���
		 * Integer.toBinaryString()
		 * 
		 * 45646 --> "10101111000111"
		 * 
		 * 10101111000111
		 *       i
		 * 
		 * 00000000000001
		 * 00000010000000 t
		 * 00000010000000
		 */
		
		System.out.print("����������");
		int a = new Scanner(System.in).nextInt();
		
		String r = "";
		
		//�ӵ�1λ������32λ������ÿһλ
		for(int i=0; i<32; i++) {
			int t = 1<<i;
			t = t&a;
			if(t==0) {
				r = 0+r;
			} else {
				r = 1+r;
			}
		}
		
		System.out.println(r);
		
	}
}







