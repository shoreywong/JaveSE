package day0102;

public class Test1 {
	public static void main(String[] args) {
		//����˸����� abcdefgh��
		//����������������Сֵ�����ֵ
		byte a = -128;
		byte b = 127;
		/*
		 * jdk����е�Short�࣬
		 * Short���ж����
		 * ���� MIN_VALUE�б�����short��Сֵ
		 */
		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;
		
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;
		
		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;
		
		//�ĸ����� ijkl
		//������float��double����Сֵ���ֵ
		float i = Float.MIN_VALUE;
		float j = Float.MAX_VALUE;
		
		double k = Double.MIN_VALUE;
		double l = Double.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}


