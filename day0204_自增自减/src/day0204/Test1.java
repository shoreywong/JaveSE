package day0204;

public class Test1 {
	public static void main(String[] args) {
		int a;
		
		a = 5;
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println("------------");
		
		a = 5;
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println("------------");
		
		a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------");
		
		a = 5;
		/*
		 * 1. ȡa��ԭֵ5���ȴ���ֵ
		 * 2. a�������6
		 * 3. �ѵ�1��ȡ����ֵ5�����±��浽a
		 */
		a = a++;
		System.out.println(a);
	}
}




