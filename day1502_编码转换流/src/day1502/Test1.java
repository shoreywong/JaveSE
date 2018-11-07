package day1502;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * f4 ����GBK����
		 * f5 ����UTF-8����
		 * 
		 * OSW--FOS--f4, GBK
		 * OSW--FOS--f5, UTF-8
		 */
		OutputStreamWriter out1 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f4"), "GBK");
		OutputStreamWriter out2 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f5"), "UTF-8");
		
		out1.write("abc����");
		out2.write("abc����");
		
		out1.close();
		out2.close();
		
		 
		
	}
}





