package day0903;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(3,4);
		Point b = new Point(3,4);
		
		//println(String)
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		//println(Object)
		//�õ�����󣬻��ȵ��ö���� toString()
		//�ٴ�ӡ toString()�Ľ���ַ���
		System.out.println(a);
		
		//�Ƚϱ����д�ĵ�ֵַ
		System.out.println(a == b);
		
		System.out.println(a.equals(b));
		
		
	}
}



