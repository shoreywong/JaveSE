package day1205;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			f1();
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ����");
			//��ӡ�������쳣��Ϣ
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Ŀ¼������");
			e.printStackTrace();
		}
	}

	private static void f1() throws ParseException,IOException {
		/*
		 * ���գ�1998-12-3
		 * --> Date --> ����6234234523235
		 * 
		 * "d:\6234234523235.txt"
		 */
		System.out.print("����(yyyy-MM-dd)��");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = 
			new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		String path = "d:\\"+d.getTime()+".txt";
		File f = new File(path);
		f.createNewFile();//�ڴ����½��ļ�
	}
}	







