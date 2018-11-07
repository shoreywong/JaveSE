package day1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	private static List<Food> list;
	
	public static void main(String[] args) throws Exception {
		System.out.println("���س�ѡ��ʳ��");
		while(true) {
			new Scanner(System.in).nextLine();

			//����food-list.txt������һ������
			list = load();
			//System.out.println(list);
			
			int index = list.size()/3*2;
			//��������ѡ�����������
			Food[] a = new Food[3];
			a[0] = 
			 list.get(new Random().nextInt(index));
			//��ѭ��ѡ��ڶ���
			while(true) {
				Food f = 
				 list.get(new Random().nextInt(index));
				//�ظ���ѡ����ͬһ������
				if(f == a[0]) {
					continue;
				}
				a[1] = f;
				break;
			}
			//������
			//index+[0,size()-index)
			a[2] = list.get(
				index+new Random().nextInt(
						list.size()-index));
			
			//����ʳ���ѡ���������
			for (Food f : a) {
				f.setTimes(f.getTimes()+1);
			}
			
			//list������ʳ���������
			Collections.sort(list);
			
			//list�����ݣ����浽�ļ�
			save(list);
			
			//��ʾѡ����
			for (Food f : a) {
				System.out.println(f.getName());
			}
		}
		
		
	}

	private static void save(List<Food> list) throws Exception {
		String path = getPath();
		/*
		 * PW--OSW--FOS--path
		 */
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream(path),"GBK"));
		for (Food f : list) {
			out.println(f);
		}
		out.close();
	}

	private static List<Food> load() throws Exception {
		//����ļ�·��
		String path = getPath();
		//System.out.println(path);
		/*
		 * BR--ISR--FIS--path
		 */
		List<Food> list = 
			new ArrayList<>();
		
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 new FileInputStream(path),"GBK"));
		
		String line;
		while((line=in.readLine()) != null) {
			line = line.trim();
			if("".equals(line)) {
				continue;
			}
			//��������;0 --> ["��������", "0"]
			String[] a = line.split(";");
			Food f = new Food(
				a[0].trim(), 
				Integer.parseInt(a[1].trim()));
			list.add(f);
		}		
		return list;
	}

	private static String getPath() throws Exception {
		/*
		 * Test1.class�������
		 * D:\lesson\1809\ws1809\day1503_������\bin
		 * ��Test1.class�����һ����ļ���
		 * ���������binĿ¼������
		 * 
		 * "/" ���������Ŀ¼,binĿ¼
		 * "/food-list.txt"
		 * "/day1503/food-list.txt"
		 */
		//����URL�����ʽ
		//���ı����UTF-8�ֽ�ֵ
		//%e9%9a%8f
		String path = 
			Test1.class
			.getResource("/food-list.txt")
			.getPath();
		
		//URL���������������
		path = URLDecoder.decode(path,"UTF-8");
		
		return path;
		
	}
}







