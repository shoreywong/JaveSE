package day1102;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> ����
		 *    ���Ƽ����д�ŵ���������
		 *    ���Ͳ�֧�ֻ�������
		 */
		LinkedList<String> list = 
				new LinkedList<>();
		list.add("aaa");
		list.add("www");
		list.add("uuu");
		list.add("kkk");
		list.add("fff");
		list.add("aaa");
		list.add("aaa");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.remove("aaa"));
		System.out.println(list);
		System.out.println(list.remove("xxx"));
		System.out.println(list);
		//˫�������±����Ч�ʵ�
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("\n----------------");
		//����������
		//�½�����������
		Iterator<String> it = list.iterator();   
		//����������
		while(it.hasNext()) {
			//ȡ��һ��
			String s = it.next();
			System.out.println(s);
		}
	}
}








