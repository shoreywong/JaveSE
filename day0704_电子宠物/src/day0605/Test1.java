package day0605;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("�������������");
		String name = 
		 new Scanner(System.in).nextLine();
		//�½�Dog���󣬴浽����dog
		Dog dog = new Dog(name);
		//��dog���������Ը�ֵ
		//dog.name = name;
		//dog.happy = 50;
		//dog.full = 50;
		
		System.out.println(
		 "��ϲ���Ѿ�������һֻ�µĳ���");
		System.out.println("���س�����");
		
		//���� play() ������ ��dog���󴫵ݵ��������
		play(dog);
	}

	private static void play(Dog dog) {
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch(r) {
			case 0: dog.feed(); break;
			case 1: dog.play(); break;
			case 2: dog.punish(); break;
			}
		}
	}
}








