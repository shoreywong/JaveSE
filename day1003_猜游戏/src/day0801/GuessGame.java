package day0801;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String r = suiJi();//�������ֵ
		System.out.println(r);
		tiShi();//��ʾ
		while(true) {
			System.out.print("�£�");
			String c = new Scanner(System.in).nextLine();
			//c��r�Ƚϣ�����ñȽϽ��
			String result = biJiao(c, r);
			System.out.println(result);
			//result�ǲ��ǲ¶ԵĽ��
			if(caiDui(result)) {
				break;
			}
		}		
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String result);
}



