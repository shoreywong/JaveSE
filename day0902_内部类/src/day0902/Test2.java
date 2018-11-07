package day0902;

public class Test2 {
	public static void main(String[] args) {
		Weapon w1 = f1();
		w1.kill();
		System.out.println(w1);
		
		Weapon w2 = f2("�������µ�");
		w2.kill();
		System.out.println(w2);
	}

	private static Weapon f2(final String name) {
		/*
		 * �ֲ��ڲ����У�ʹ������ľֲ�������
		 * ����� final
		 */
		Weapon w = new Weapon() { 
			@Override
			public void kill() {
				System.out.println(
				 "ʹ��"+name+"����");
			}
		};
		
		return w;
	}
	
	
	
	

	private static Weapon f1() {
		class AK47 implements Weapon {
			@Override
			public void kill() {
				System.out.println("ʹ��AK47����");
			}
		}
		
		AK47 a = new AK47();
		return a;		
	}
}






