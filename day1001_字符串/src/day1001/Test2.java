package day1001;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * �ж�������ַ����Ƿ��ǡ����ġ�
		 * ������ͬ
		 * abcdedcba
		 */
		System.out.println("�����ַ�����");
		String s = new Scanner(System.in).nextLine();
		if(huiWen(s)) {
			System.out.println("�ǻ���");
		} else {
			System.out.println("���ǻ���");
		}
	}

	private static boolean huiWen(String s) {
		/*
		 * abxddcba
		 *   i  j
		 */
		//i��0������j��ĩβ�ݼ�
			//���iλ���ַ���jλ���ַ������
				//����false
		
		//ѭ������������true
		
		for(int i=0,j=s.length()-1; i<j; i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
}





