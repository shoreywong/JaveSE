package day1601;

public class Test1 {
	/*
	 * ����������󣬻��Զ�����һ�� main �̣߳�
	 * ��main�߳��У�����main()����
	 */
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		
		//�����߳�
		//�߳��������Զ�ִ��run()����
		t1.start();
		t2.start();
		
		System.out.println("main�߳�ִ�еĴ���");
		
	}
	
	static class T1 extends Thread {
		@Override
		public void run() {
			//����̵߳�����
			//setName("");
			String n = getName();
			for(int i=1;i<=1000;i++) {
				System.out.println(n+" - "+i);      
			}
		}
	}
}






