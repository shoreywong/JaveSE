package day0901;

public class Transformer {
	//���ν��ʹ��һ�������ӿ�
	private Weapon w;
	
	public void setWeapon(Weapon w) {
		this.w = w;
	}
	
	public void attack() {
		//û������
		if(w == null) {
			System.out.println("����ҧ");
			return;
		}		
		/* w.getType() ������
		 * ת�����ַ���"�����"��"�ȱ���"��"������"
		 */
		String t = "";
		switch(w.getType()) {
		case 0: t="�����"; break;
		case 1: t="�ȱ���"; break;
		case 2: t="������"; break;
		}		
		//ʹ����������콣����
		System.out.println("ʹ��"+t+w.getName()+"����");
		w.kill();
		
	}
}









