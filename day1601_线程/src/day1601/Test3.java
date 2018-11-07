package day1601;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		//main�߳�
		System.out.println("���س�ͱ��t1�߳�");
		new Scanner(System.in).nextLine();
		t1.interrupt();
	}
	
	static class T1 extends Thread {
		long t;//���������һ�εĺ���ֵ
		
		@Override
		public void run() {
			SimpleDateFormat sdf = 
			 new SimpleDateFormat("HH:mm:ss.SSS");
			
			while(true) {
				Date d = new Date();
				int y = 0;//��1000������
				if(t==0) {//��һ�δ�ӡ
					t = d.getTime();
				} else {//�ٴδ�ӡ
					y = (int) ((d.getTime()-t)%1000); 
				}
				String s = sdf.format(d);  
				System.out.println(s);
				System.out.println(y);
				try {
					Thread.sleep(1000-y);
				} catch (InterruptedException e) {
					System.out.println("˭TMDͱ��������");
					break;
				}
			}			
			
		}
	}
}



