package day0306;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * ��Ԫ��ټ�
		 * ����5Ԫ1ֻ
		 * ĸ��3Ԫ1ֻ
		 * С��1Ԫ3ֻ
		 * 
		 * *)��������g��0��<=20
		 *      *)��gֻ����ʣ��Ǯ�浽money
		 *      *)��money��ĸ����������浽max
		 *      *)ĸ������m��0��<=max
		 *           *)money��mֻĸ��ʣ��Ǯȫ��С��    
		 *             �����浽���� x
		 *           *)���g+m+x==100
		 *                *)��ӡ������
		 */
		for(int g=0; g<=20; g++) {
			int money = 100-g*5;
			int max = money/3;
			for(int m=0; m<=max; m++) {
				int x = (money-m*3)*3;
				if(g+m+x == 100) {
					System.out.println(
					 "����:"+g+",ĸ��:"+m+",С��:"+x);
				}
			}
		}
	}
}
