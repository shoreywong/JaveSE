package day0604;

public class Test1 {
	public static void main(String[] args) {
		//�½�Car���󣬴浽����c1
		//�½�Car���󣬴浽����c2
		Car c1 = new Car("������","��ɫ",230);
		Car c2 = new Car("��+��","��ɫ",30);
		
		//��c1��c2�ĳ�Ա������ֵ
		//c1.brand = "������";
		//c1.color = "��ɫ";
		//c1.speed = 230;
		
		//c2.brand = "��+��";
		//c2.color = "��ɫ";
		//c2.speed = 30;
		
		c1.go();
		c1.stop();
		c2.go();
		c2.stop();
	}
}
