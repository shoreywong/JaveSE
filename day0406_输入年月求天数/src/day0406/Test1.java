package day0406;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("��:");
		int y = new Scanner(System.in).nextInt();
		System.out.print("��:");
		int m = new Scanner(System.in).nextInt();

		if (m < 1 || m > 12) {
			System.out.println("������·�");
			return;// �������˽���
		}

		/*
		 * y,m���� f() ���������� �ٵõ������ķ���ֵ���浽���� r
		 */
		int r = f(y, m);
		System.out.println(y + "��" + m + "����" + r + "��");
	}

	static int f(int y, int m) {
		// �������r����������
		int r = 0;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			r = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			r = 30;
			break;
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				r = 29;
			} else {
				r = 28;
			}
		}
		return r;
	}
}
