package day0501;

import java.util.Scanner;

public class Test1 {
	static String[] names = {"iPhone X","��ΪP20","С��8","vivo","OPPO Find-X"};
	static int[] numbers = {90,100,120,80,50};
	static double[] prices = {7600,5300,3999,4199,2999};
	
	
	public static void main(String[] args) {
		outer:
		while(true) {
			//��ʾ�˵���������û�ѡ���ֵ
			int c = menu();
			switch(c) {
			case 1: f1(); break;
			case 2: f2(); break;
			case 3: f3(); break;
			case 4: f4(); break;
			case 5: break outer;
			}
		}
	}
	
	static int menu() {
		System.out.println("\n\n---------------");
		System.out.println("1. ��Ʒ�б�");
		System.out.println("2. ��Ʒ¼��");
		System.out.println("3. ��Ʒ��ѯ");
		System.out.println("4. ͳ����Ϣ");
		System.out.println("5. �˳�");
		System.out.println("---------------");
		System.out.print("ѡ��");
		
		return new Scanner(System.in).nextInt();
	}
	static void f1() {
		/*
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 * 1. ���ƣ�A, ������5, �۸�122
		 * 2.
		 * 3.
		 */
		//��������
		for(int i=0; i<names.length; i++) {
			String n = names[i];
			int b = numbers[i];
			double p = prices[i];
			
			System.out.println(
			 (i+1)+". ���ƣ�"+n+", ������"+b+", �۸�"+p);
			
		}
		
	}
	
	static void f2() {
		/*
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 * 
		 * �����1����Ʒ��
		 * ���ƣ�x
		 * ������1
		 * �۸�1
		 * 
		 * �����2����Ʒ��
		 * 
		 */
		//��������
		for(int i=0; i<names.length; i++) {
			System.out.println("\n�����"+(i+1)+"����Ʒ��");
			System.out.print("���ƣ�");
			names[i] = new Scanner(System.in).nextLine();
			System.out.print("������");
			numbers[i] = new Scanner(System.in).nextInt();
			System.out.print("�۸�");
			prices[i] = new Scanner(System.in).nextDouble();
		}
		
		//������ʾ�б�
		f1();
	}
	
	static void f3() {
		/*
		 *   B
		 * 
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 */ 
		System.out.print("��ѯ����Ʒ���ƣ�");
		String t = 
		 new Scanner(System.in).nextLine();
		//��������
		for(int i=0; i<names.length; i++) {
			//���t��names[i]������ͬ
			//�Ƚ��ַ���������equals()����
			if(t.equals(names[i])) {
				String n = names[i];
				int b = numbers[i];
				double p = prices[i];
				
				System.out.println(
				 (i+1)+". ���ƣ�"+n+", ������"+b+", �۸�"+p);
				return;
			}
		}
		
		System.out.println("�Ҳ�������Ʒ");

	}
	
	
	static void f4() {
		/*
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 *  
		 * ��Ʒ�ܼ�
		 * ���۾���
		 * ����ܼ�
		 * ��ߵ���
		 */
		double spzj = 0;//��Ʒ�ܼ�
		double djzj = 0;//�����ܼ�
		double zgzj = 0;//����ܼ�
		double zgdj = 0;//��ߵ���
		
		//��������
		for(int i=0;i<names.length;i++) {
			spzj += numbers[i]*prices[i];
			djzj += prices[i];
			//����ܼ۱� zgzj ���ߣ���������ߵ�ֵ
			//�浽 zgzj ����
			if(numbers[i]*prices[i] > zgzj) {
				zgzj = numbers[i]*prices[i];
			}
			if(prices[i] > zgdj) {
				zgdj = prices[i];
			}
		}
		
		System.out.println("��Ʒ�ܼۣ�"+spzj);
		System.out.println("���۾��ۣ�"+(djzj/names.length));
		System.out.println("����ܼۣ�"+zgzj);
		System.out.println("��ߵ��ۣ�"+zgdj);
	}
	
	
	
}
