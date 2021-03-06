package day1601;

public class Test4 {
	public static void main(String[] args) {
		/*
		 * 再 1000万内寻找质数，
		 * 求1000万内质数的数量
		 */
		f1();
		//f2();
	}
	
	private static void f2() {
		long t = System.currentTimeMillis();
		
		T1 t1 = new T1(0,2000000);
		T1 t2 = new T1(2000000,4000000);
		T1 t3 = new T1(4000000,6000000);
		T1 t4 = new T1(6000000,8000000);
		T1 t5 = new T1(8000000,10000000);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (Exception e) {
		}
		int sum = t1.count+t2.count+t3.count+t4.count+t5.count;
		System.out.println("质数数量："+sum);		
		t = System.currentTimeMillis()-t;
		System.out.println("执行时间："+t);
	}

	private static void f1() {
		long t = System.currentTimeMillis();
		T1 t1 = new T1(0, 10000000);
		t1.start();
		//main等待t1结束
		try {
			t1.join();
		} catch (InterruptedException e) {   
		}
		System.out.println("质数数量："+t1.count);
		t = System.currentTimeMillis()-t;
		System.out.println("执行时间："+t);
	}
	
	

	static class T1 extends Thread {
		int start;
		int end;
		int count;//结果
		public T1(int start, int end) {
			if(start<3) {
				start = 3;
				count = 1;
			}
			this.start = start;
			this.end = end;
		}
		@Override
		public void run() {
			for(int i=start; i<end; i++) {
				//判断i是否是质数
				if(isPrime(i)) {
					count++;
				}
			}
		}
		private boolean isPrime(int i) {       
			double max = 1+Math.sqrt(i);
			for(int j=2;j<max;j++) {
				if(i%j == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
}



