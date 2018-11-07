package day0801;

import java.util.Random;

public class GuessLetterGame extends GuessGame {
	@Override
	public String suiJi() {
		/* ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 * 
		 *                 j         
		 * LTCDEFGHIJKAMNOPQRSBUVWXYZ
		 *   i
		 *   
		 *   t = C
		 *   
		 *   LTCDE
		 */
		//�½�StringBuilder�������26����д��ĸ
		StringBuilder sb = new StringBuilder(
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		//ѭ������ǰ5��λ��
		for(int i=0;i<5;i++) {
			//26��λ���������λ
			int j = new Random().nextInt(26);
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		//ɾ�� [5, 26)
		sb.delete(5, 26);
		return sb.toString();
	}
	
	
	@Override
	public void tiShi() {
		System.out.println(
			"�Ѿ����������5�����ظ��Ĵ�д��ĸ");
		System.out.println("�����5����ĸ");
	}
	
	
	@Override
	public String biJiao(String c, String r) {
		/*
		 *            a=2, b=2
		 * r EPCYN
		 *    j     
		 * c YPCED
		 *    i
		 */
		int a = 0;
		int b = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				//iλ���ַ���jλ���ַ����
				if(c.charAt(i) == r.charAt(j)) {    
					//���ж�λ���Ƿ����
					if(i==j) a++;
					else b++;
					
					break;
				}
			}
		}		
		return a+"A"+b+"B";
	}
	
	
	
	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
}
