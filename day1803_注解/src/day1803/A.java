package day1803;

public class A {
	@Test(id=1, value="���Դ���1")
	public void a() {
		System.out.println("A.a");
	}
	public void b() {
		System.out.println("A.b");
	}
	@Test(id=2)
	public void c() {
		System.out.println("A.c");
	}
	@Test("���Դ���3")
	public void d() {
		System.out.println("A.d");
	}
}
