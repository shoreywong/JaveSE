package day1801;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		Student s = new Student(5,"����","��",22);
		
		//������ʱ���id
		Field id = c.getDeclaredField("id");
		
		id.setAccessible(true);
		
		Object v = id.get(s);//������ʱ�����ֵ
		System.out.println(v);
		
		id.set(s, 999);//����Ϊ������ֵ
		System.out.println(s.getId());
		
	}
}



