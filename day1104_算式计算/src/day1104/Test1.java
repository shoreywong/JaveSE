package day1104;

import java.util.Scanner;

import day1104.Formula.DieDaiQi;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("������ʽ��");
		String s = new Scanner(System.in).nextLine();
		//��װ�� Formula ����
		Formula f = new Formula(s);
		//����������
		/*DieDaiQi it = f.iterator();
		while(it.hasNext()) {
			String b = it.next();
			System.out.println(b);
		}*/
		try {
			//��ֵ
			double r = f.eval();
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("�������ʽ��ʽ����");
		}
	}
}




