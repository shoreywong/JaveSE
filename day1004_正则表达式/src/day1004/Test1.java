package day1004;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		// ���֤�š��̶��绰����
		System.out.print("���֤�ţ�");
		String id = new Scanner(System.in).nextLine();
		System.out.print("�̶��绰���룺");
		String tel = new Scanner(System.in).nextLine();
		if(f1(id)) {
			System.out.println("���֤�Ÿ�ʽ��ȷ");
		} else {
			System.out.println("���֤�Ÿ�ʽ����");
		}
		
		if(f2(tel)) {
			System.out.println("�绰�����ʽ��ȷ");
		} else {
			System.out.println("�绰�����ʽ����");
		}
		
	}

	private static boolean f1(String id) {
		/*
		 * 123456789012345
		 * 123456789012345678
		 * 12345678901234567x
		 * 12345678901234567X
		 * |
		 * \d{15}|
		 * \d{15}|\d{17}
		 * \d{15}|\d{17}[\dxX]
		 * 
		 * \\d{15}|\\d{17}[\\dxX]
		 */
		String regex = "\\d{15}|\\d{17}[\\dxX]";
		return id.matches(regex);
	}

	private static boolean f2(String tel) {
		/*
		 * 1234567
		 * 12345678
		 * 010-1234567
		 * 0101-1234567
		 * (010)12345678
		 * (0101)12345678
		 * 
		 * \d{7,8}
		 * ()?\d{7,8}
		 * (|)?\d{7,8}
		 * (\d{3,4}-|)?\d{7,8}
		 * (\d{3,4}-|())?\d{7,8}
		 * (\d{3,4}-|\(\))?\d{7,8}
		 * (\d{3,4}-|\(\d{3,4}\))?\d{7,8}
		 * 
		 * (\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}
		 */
		String regex = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
		return tel.matches(regex);
	}
}




