package day0303;

public class Test1 {
	public static void main(String[] args) {
		//i��100��<1000
		for(int i=100; i<1000; i++) {
			/*
			 * i = 456
			 * i%10  6
			 * i/10%10  5
			 * i/100  4
			 */
			int a = i%10;//��λ
			int b = i/10%10;//ʮλ
			int c = i/100;//��λ
			//��������������η���ӣ�
			//��ԭֵ���
			if(a*a*a+b*b*b+c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
