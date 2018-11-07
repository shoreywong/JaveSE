package day1104;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formula {
	private String f;
	
	public Formula(String f) {
		f = f.trim();
		this.f = f;
	}
	
	//������������������
	public DieDaiQi iterator() {
		return new DieDaiQi();
	}
	
	//��������
	class DieDaiQi {
		int from; //ÿ�β��ҵ���ʼλ���±�
		Matcher m = 
			Pattern
			.compile("\\d+(\\.\\d+)?|[+\\-*/]") 
			.matcher(f);
		
		public String next() {
			m.find(from);//��from�����
			String s = m.group();//��ȡ�ҵ����Ӵ�
			from = m.end();//from��λ����һ��ĩβ
			return s;
		}
		public boolean hasNext() {
			/*
			 * 1+2-3*4/5 
			 *          |
			 *         from
			 */
			return from < f.length();
		}
	}
	
	public double eval() {
		/*
		 * 341 + 3.1344 - 5234.4 * 0.42 / 545      
		 * 
		 * 
		 * 2323 4534
		 * ------------------------------------
		 * -
		 * ------------------------------------
		 * 341   +   3.1344   =  
		 */
		
		LinkedList<Double> list1 = new LinkedList<>();
		LinkedList<Character> list2 = new LinkedList<>();
		
		DieDaiQi it = iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.matches("\\d+(\\.\\d+)?")) {//s������
				list1.add(Double.parseDouble(s));
			} else if(s.matches("[+\\-]")) {//s�ǼӼ�
				list2.add(s.charAt(0));
			} else {//s�ǳ˳�
				double a = list1.removeLast();
				double b = Double.parseDouble(it.next());
				double c = jiSuan(a, s.charAt(0), b);
				list1.add(c);
			}
		}//while����
		
		//�����мӼ���
		while(list2.size() != 0) {
			double a = list1.removeFirst();
			double b = list1.removeFirst();
			char op = list2.removeFirst();
			double c = jiSuan(a, op, b);
			list1.addFirst(c);
		}		
		return list1.get(0);
	}
	private double jiSuan(double a, char op, double b) {
		BigDecimal bd1 = BigDecimal.valueOf(a);
		BigDecimal bd2 = BigDecimal.valueOf(b);
		BigDecimal bd3 = null;
		switch(op) {
		case '+': bd3 = bd1.add(bd2); break;
		case '-': bd3 = bd1.subtract(bd2); break;
		case '*': bd3 = bd1.multiply(bd2); break;
		case '/': bd3 = bd1.divide(bd2,4,BigDecimal.ROUND_HALF_UP); break;
		}
		
		bd3 = bd3.setScale(4,BigDecimal.ROUND_HALF_UP);
		return bd3.doubleValue();
		
		
		
		/*double r = 0;
		switch(op) {
		case '+': r = a+b; break;
		case '-': r = a-b; break;
		case '*': r = a*b; break;
		case '/': r = a/b; break;
		}
		return r;*/
	}
	
}






