package day0801;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiJi() {
		int r = 1+ new Random().nextInt(1000);
		//int ת�� String
		String s = String.valueOf(r);
		return s;
	}
	@Override
	public void tiShi() {
		System.out.println(
		 "�Ѿ�������һ��[1,1001)��Χ���������");
		System.out.println("���������Ǽ�");
	}
	@Override
	public String biJiao(String c, String r) {
		//String ����ת�� int
		int a = Integer.parseInt(c);
		int b = Integer.parseInt(r);
		if(a>b) {
			return "��";
		} else if(a<b) {
			return "С";
		} else {
			return "��";
		}
	}
	@Override
	public boolean caiDui(String result) {
		return "��".equals(result);
	}
}




