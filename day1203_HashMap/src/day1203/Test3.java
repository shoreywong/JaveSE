package day1203;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Point a = new Point(1, 3.2);
		Point b = new Point(1, 3.2);
		
		//��������Ĺ�ϣֵ������ͬ��
		//���ܱ�֤�������ͬ��λ��
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//��ʹ��ϣֵ��ȣ�
		//equals()Ҳ������Ȳ��ܸ���
		//������������һ��
		System.out.println(a.equals(b));
		
		HashMap<Point, String> map = new HashMap<>();
		map.put(a, "3.25��");
		map.put(b, "3.26��");
		System.out.println(map);
	}
}








