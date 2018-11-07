package day0502;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//׼�������������������������
		int[] r = zbsz(33);
		int[] b = zbsz(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//������rѡ��6������
		int[] red = xuanRed(r);
		//������bѡ��1������
		int blue = xuanBlue(b);
		
		System.out.println(Arrays.toString(red));
		System.out.println(blue);
	}
	
	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
	}

	private static int[] xuanRed(int[] r) {
		/*
		 *           t = 2
		 * 
		 *                         j        j                                                          
		 * [4,7,3,10,1,14,11,8,9,5,2,12,13,6,15,16,17...33]
		 *                i
		 * [4,7,3,10,1,14]
		 */
		//iѭ����0��<6
		for(int i=0; i<6; i++) {
			//j�����λ����Χ[0, 33)
			int j = new Random().nextInt(33);
			//r[i]��r[j]����
			int t = r[i];
			r[i] = r[j];
			r[j] = t;
		}
		//��ȡr�����ǰ6��λ�ã�
		//����һ��������
		return Arrays.copyOf(r, 6);
		
	}



	static int[] zbsz(int n) {
		//�½�int[]���飬���� n
		//��ַ�浽���� a
		int[] a = new int[n];
		
		//��������a
		//˳����� 1,2,3,4...
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		return a;
	}
}




