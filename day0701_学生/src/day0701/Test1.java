package day0701;

public class Test1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(6,"����");
		Student s3 = new Student(7,"����","��");
		Student s4 = new Student(8,"����","Ů",18);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}
}	
