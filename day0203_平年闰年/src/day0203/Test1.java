package day0203;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("������ţ�");
		//�Ȼ�������ֵ
		//�ٴ浽���� y
		int y = new Scanner(System.in).nextInt();
		
		//�����ַ�������r����Ĭ��ֵ"ƽ��"
		String r = "ƽ��";
		
		//�ж�y�����������꣬�޸ı���r���ĳ�"����"
		
		//���y�ܱ�4����
		/*if(y%4 == 0) {
			//�ܱ�4�����������
			//��һ���жϲ��ܱ�100����
			if(y%100 != 0) {
				r = "����";
			}
		}
		//���y�ܱ�400����
		if(y%400 == 0) {
			r = "����";
		}*/
		
		
		if((y%4==0 && y%100!=0) || y%400==0) {
			r = "����";
		}
		
		System.out.println(y+"����"+r);
	}
}







