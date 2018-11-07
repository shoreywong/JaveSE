package day0301;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("������");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println("\n\n--������--------");
		f1(n);//�ڷ����д�ӡn��������
		
		System.out.println("\n\n--������--------");
		f2(n);
		
		System.out.println("\n\n--����������--------");
		f3(n);
	}
	
	static void f1(int n) {
		/* i
		 * 1 *****
		 * 2 *****
		 * 3 *****
		 * 4 *****
		 * n *****
		 *   1234n j
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");  
			}
			System.out.println();
		}
	}
	
	static void f2(int n) {
		/* i
		 * 1 *
		 * 2 **
		 * 3 ***
		 * 4 ****
		 * n *****
		 *   1234i j
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void f3(int n) {
		/* i
		 * 1     *
		 * 2    ***
		 * 3   *****
		 * 4  *******
		 * n *********
		 * 
		 * �ո������� n-i ��
		 * �Ǻŵ������� 2*i-1 ��
		 */
		for(int i=1; i<n; i++) {
			//n-i���ո�
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//2*i-1���Ǻ�
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}		




