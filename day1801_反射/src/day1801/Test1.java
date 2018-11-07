package day1801;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println("����������");
		String s = new Scanner(System.in).nextLine();
		
		/*
		 * "java.lang.String"
		 * "java.util.ArrayList"
		 * "java.io.File"
		 * "day1801.Student"
		 */
		Class<?> c = Class.forName(s);
		
		System.out.println(c.getPackage().getName());
		System.out.println(c.getName());//��������
		System.out.println(c.getSimpleName());//��������
		
		System.out.println("\n\n--��Ա����----------------");
		f1(c);
		
		System.out.println("\n\n--���췽��----------------");
		f2(c);
		
		System.out.println("\n\n--����----------------");
		f3(c);
		
	}

	private static void f1(Class<?> c) {
		/*
		 * Field���󣬷�װһ����Ա�����Ķ�����Ϣ
		 * 
		 * private static final String d; 
		 */
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			Class<?> type = f.getType();
			String name = f.getName();
			System.out.println(
			 type.getSimpleName()+" "+name);
		}
	}
	

	private static void f2(Class<?> c) {
		/*
		 * Constructor ��װ���췽���Ķ�����Ϣ
		 * 
		 * public A(int,String) throws X,Y,Z
		 */
		Constructor<?>[] a = c.getDeclaredConstructors();		
		for (Constructor<?> t : a) {
			String n = c.getSimpleName();
			Parameter[] p = t.getParameters();
			System.out.println(
			 n+"("+Arrays.toString(p)+")");
		}
	}

	private static void f3(Class<?> c) {
		/*
		 * Method ��װһ�������Ķ�����Ϣ
		 * 
		 * public static final String f(int,String) throws X,Y,Z
		 */
		Method[] a = c.getDeclaredMethods();
		for (Method m : a) {
			String r = m.getReturnType().getSimpleName();
			String n = m.getName();
			Parameter[] p = m.getParameters();
			System.out.println(
			 r+" "+n+"("+Arrays.toString(p)+")");
		}
	}
}







