package day0209;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("����ٷ��Ʒ�����");
		int s = new Scanner(System.in).nextInt();
		
		//����f()������
		//��s��ֵ���ݵ�f()������������
		f(s);
	}
	
	static void f(int a) {
		//���a��Χ����
		if(a<0 || a>100) {
			System.out.println("�ٷ�֮��������");
			//�������˽���,���ص�����λ�ü���
			return;
		}
		
		//�������r�����������嵵���ƽ��
		char r = 0;
		//���ݰٷ��Ʒ���a����ȷ��r��ֵ
		switch(a/10) {
		case 10:
		case 9:
			r = 'A';
			break;
		case 8:
		case 7:
			r = 'B';
			break;
		case 6:
			r = 'C';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
			r = 'D';
			break;
		case 1:
		case 0:
			r = 'E';
			break;
		}
		
		System.out.println("�嵵���ƣ�"+r);
		
	}
	
}






