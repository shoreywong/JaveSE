package day0604;
/*
 * ��װ
 * ��������ص��������ݣ����߼����㷽����
 * ��װ�ɡ��ࡱ���
 */
public class Car {
	String brand;//null
	String color;//null
	int speed;//0
	
	public Car(String brand,String color,int speed) {
		//��ͬ���ֲ�����
		//������this.brand�����ʳ�Ա����
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public void go() {
		System.out.println(
		 color+brand+"ǰ����ʱ�٣�"+speed);
	}
	public void stop() {
		System.out.println(
		 color+brand+"ֹͣ");
	}
}











