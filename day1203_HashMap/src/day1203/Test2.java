package day1203;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("�����ַ�����");
		String s = new Scanner(System.in).nextLine();
		
		//�½�HashMap<Character, Integer>����
		//�浽���� map
		HashMap<Character, Integer> map = new HashMap<>();        
		//iѭ�������ַ���s
		for(int i=0;i<s.length();i++) {
			//ȡ��s��iλ�õ��ַ����浽c
			char c = s.charAt(i);
			//��mapȡ��c��Ӧ�ļ������浽Integer����count
			Integer count = map.get(c);
			//���count��null
			if(count == null) {
				//��map�з���c��Ӧ����1
				map.put(c, 1);
			} else {
				//��map�з���c��Ӧ����count+1
				map.put(c, count+1);
			}
		}
		//ѭ�������󣬴�ӡmap
		System.out.println(map);
	}
}







