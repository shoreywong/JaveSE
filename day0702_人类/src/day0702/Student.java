package day0702;

public class Student extends Person {
	String school;
	
	//��дtoString()����
	//�Լ̳еķ��������и�д
	@Override
	public String toString() {
		//���ø����Ա
		//һ���ڷ�����дʱ��
		//���ø����ͬһ����������
		String s = super.toString();
		
		return s+", "+school;  
	}
}




