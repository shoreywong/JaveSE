package day0702;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("����","��",16);
		Student s = new Student();
		Employee e = new Employee();
		
		s.name = "����";
		s.gender = "Ů";
		s.age = 18;
		s.school = "����״�ѧ";
		
		e.name = "����";
		e.gender = "��";
		e.age = 19;
		e.salary = 8000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
		f(p);
		f(s);
		f(e);
	}
	
	
	static void f(Person p) {
		System.out.println("\n\n--���������ʹ���-------");
		System.out.println(p.toString());
	}
	
}












