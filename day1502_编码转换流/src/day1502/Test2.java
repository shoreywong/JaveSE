package day1502;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * Unicode�������е������ַ� 20902 ��
		 * '\u4e00' �� '\u9fa5'
		 * 
		 * 30��һ��
		 * 
		 * OSW--FOS--f6, GBK
		 * OSW--FOS--f7, UTF-8
		 */
		OutputStreamWriter out1 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f6"), "GBK");
		OutputStreamWriter out2 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f7"), "UTF-8");
		int count=0;
		for(char c='\u4e00'; c<='\u9fa5'; c++) {
			out1.write(c);
			out2.write(c);
			count++;
			if(count == 30) {
				out1.write('\n');
				out2.write('\n');
				count=0;
			}
		}
		out1.close();
		out2.close();
	}
}





