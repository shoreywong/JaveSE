package day1005;

public class Test1 {
	public static void main(String[] args) {
		Integer a = new Integer(5);//�·����ڴ�
		Integer b = Integer.valueOf(5);//���ʻ������
		Integer c = Integer.valueOf(5);//���ʻ������
		
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a.equals(b));
		
		System.out.println(a.byteValue());
		System.out.println(a.shortValue());
		System.out.println(a.intValue());
		System.out.println(a.longValue());
		System.out.println(a.floatValue());
		System.out.println(a.doubleValue());
	}
}
