package day0904;

public class Test1 {
	public static void main(String[] args) {
		char[] a = {'a', 'b', 'c'};
		String s1 = new String(a);//�·����ڴ�

		String s2 = "abc";//�������½�
		String s3 = "abc";//���ʳ�����ͬһ������
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		
	}
}
