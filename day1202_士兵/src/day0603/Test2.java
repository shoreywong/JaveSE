package day0603;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("��Ҫ����ʿ����");
		int n = new Scanner(System.in).nextInt();
		
		//�½�ArrayList���������ڲ������ʼ����n
		ArrayList<Soldier> list = new ArrayList<>(n);
		for(int i=1;i<=n;i++) {
			Soldier s = new Soldier();
			s.id = i;
			list.add(s);//ʿ��������ӵ�����
		}
		
		//������ʿ��
		while(list.size() != 0) {
			new Scanner(System.in).nextLine();
			//����������ȡ��ʿ���������Լ�д
			for(Iterator<Soldier> it = list.iterator(); it.hasNext();) {
				Soldier s = it.next();
				s.attack();
				if(s.blood == 0) {
					//���������ڼ䣬������ֱ���ü�����ɾ����
					//list.remove(s); 
					
					//�Ӽ���ɾ��ʿ��s
					it.remove();//ɾ���ո�ȡ��������
				}
			}
			System.out.println("ʿ��������"+list.size());
			System.out.println("\n--------------");
		}
	}
}








