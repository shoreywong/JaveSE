package day1505;

public class MyList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public void add(Object value) {
		if(head == null) {//��û������
			head = new Node();
			head.value = value;
			tail = head;//����ͷҲ��β
			//�Լ�ǰ�������Լ�
			head.prev = head;
			head.next = head;
		} else {
			Node n = new Node();
			n.value = value;
			tail.next = n;
			n.prev = tail;
			head.prev = n;
			n.next = head;
			tail = n;
		}
		size++;
	}
	
	public Object get(int i) {
		//n��head��ʼ
		Node n = head;
		int count = 0;
		//��count<i
		while(count<i) {
			n = n.next;
			count++;
		}
		return n.value;
	}
	
	public int size() {
		return size;
	}
	
	//�ڵ���
	private class Node {
		Node prev;
		Node next;
		Object value;
	} 
}




