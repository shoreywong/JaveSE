package day0304;

public class Test1 {
	public static void main(String[] args) {
		//��������j��0��<=35
		//�õ�����t��35��>=0
		for(int j=0,t=35; j<=35; j++,t--) {
			//�������94ֻ
			if(j*2 + t*4 == 94) {
				System.out.println(
				 j+"ֻ����"+t+"ֻ��");
			}
		}
	}
}
