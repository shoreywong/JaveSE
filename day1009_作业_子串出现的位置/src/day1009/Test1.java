package day1009;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�ַ�����");
		String s = new Scanner(System.in).nextLine();
		System.out.println("���ҵ��Ӵ���");
		String t = new Scanner(System.in).nextLine();
		
		int[] a = find(s, t);
		System.out.println(Arrays.toString(a));
	}

	private static int[] find(
			String s, String t) {
		/*
		 * s "abcabcabc"
		 *            |
		 *           from
		 *   
		 * t "bc"
		 * 
		 * [1,4,7,                    ]
		 *         i
		 */
		//�½��㹻��������
		int[] a = new int[s.length()];
		int i = 0;
		int from = 0;
		while(true) {
			from = s.indexOf(t, from);
			if(from == -1) {
				break;
			}
			a[i] = from;
			i++;
			from++;
		}
		a = Arrays.copyOf(a, i);
		return a;
	}
}





