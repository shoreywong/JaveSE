package day1601;

public class Test2 {
	public static void main(String[] args) {
		R1 r = new R1();//��������Ķ���
		
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		
		/*
		 * �߳�������ִ�� r.run()
		 */
		t1.start();
		t2.start();
	}
	
	static class R1 implements Runnable {
		@Override
		public void run() {
			//�Ȼ������ִ�е��̶߳���
			Thread t = Thread.currentThread();
			String n = t.getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+" - "+i);      
			}
		}
	}
}




