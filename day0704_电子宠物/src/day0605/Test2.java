package day0605;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("1. è");
		System.out.println("2. ��");
		System.out.print("ѡ��");
		int c = new Scanner(System.in).nextInt();
		
		System.out.print("������������֣�");
		String n = new Scanner(System.in).nextLine();
		
		//Cat cat = null;
		//Dog dog = null;
		Pet p = null;
		
		switch(c) {
		case 1: 
			//�½�������󣬵���������
			//�浽�����ͱ���
			p = new Cat(n);
			break;
		case 2: 
			p = new Dog(n);
			break;
		}
		play(p);
	}

	private static void play(Pet p) {
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch(r) {
			case 0: p.feed(); break;
			case 1: p.play(); break;
			case 2: p.punish(); break;
			}
		}
	}

}





