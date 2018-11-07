package day1801;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		
		Class<?> c = Class.forName(s);
		
		//�ֱ�ִ���޲κ��вι��촴������
		System.out.println("\n\n--�޲ι���-------------");
		f1(c);
		
		System.out.println("\n\n--int��������-------------");
		f2(c);
		
	}

	private static void f1(Class<?> c) {
		try {
			//ִ���޲ι��죬
			//���û���޲ι��죬������쳣
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("�޷�ִ���޲ι��췽��");
		}
	}

	private static void f2(Class<?> c) {
		try {
			//��ý��� int �����Ĺ��췽��
			//��������ڣ�������쳣
			Constructor<?> t = 
			 c.getConstructor(int.class);
			
			//�½�ʵ������ִ��������췽��
			Object obj = t.newInstance(55);
			System.out.println(obj);
			
		} catch (Exception e) {
			System.out.println(
			 "�޷�ִ��int�������췽��");
		}		
		
		/*
		 * java.lang.Integer
		 * java.util.Date
		 * java.util.ArrayList
		 * day1801.Student
		 */
	}
}







