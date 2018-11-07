package day1601;

import java.util.Random;

public class Consumer extends Thread {
	private Stack stack;

	public Consumer(Stack stack) {
		this.stack = stack;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (stack) {
				//ջ�ǿյģ��������̵߳ȴ�
				if(stack.isEmpty()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {   
					}
				}
				char c = stack.pop();
				System.out.println("���� << "+c);
				//֪ͨ��ջ�����ϵȴ��������߳�
				stack.notifyAll();
			}
		}
	}
}



