package day0202;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�������16.4����");
		System.out.println("���� 299792458 ��/��");
		System.out.println("ϲȵ�� 0.46 ��");
		System.out.println("ţ��֯Ů�����Ҫ����ֻϲȵ");  
		
		//1�����Ƕ����ף��浽 ly
		long ly = 299792458L*60*60*24*365;
		//16.4�����Ƕ����ף��浽 d
		double d = 16.4*ly;
		//��ϲȵ�������浽r
		double r = d/0.46;
		//Math.ceil(r)
		//����ȡ����ȡ���Ľ����double����
		// 34534534.0
		// ǿת�� long ����
		long n = (long) Math.ceil(r);
		
		System.out.println(n);
	}
}





