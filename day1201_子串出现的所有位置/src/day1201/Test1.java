package day1201;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("�ַ�����");
		String s = new Scanner(System.in).nextLine();
		System.out.println("���ҵ��Ӵ���");
		String t = new Scanner(System.in).nextLine();
		
		ArrayList<Integer> list = find(s, t);
		//����������ʾ���Լ�д
		for(Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

	private static ArrayList<Integer> find(String s, String t) {
		int from = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(true) {
			from = s.indexOf(t, from);
			if(from == -1) {
				break;
			}
			list.add(from);
			from++;
		}
		return list;
	}
}




