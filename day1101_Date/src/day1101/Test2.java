package day1101;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("����(yyyy-MM-dd)��");
		String s = new Scanner(System.in).nextLine();
		//"1993-5-12"
		//������ Date ����
		SimpleDateFormat sdf = 
		 new SimpleDateFormat("yyyy-MM-dd");		
		//��ctrl+1��ѡ�� add throws ....
		Date d = sdf.parse(s);		
		long t = 
		System.currentTimeMillis()-d.getTime();
		
		t = t/1000/60/60/24;
		System.out.println("���Ѿ�������"+t+" ��");
	}
}












