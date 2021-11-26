package inheritance;

public class B extends A {
	int numB = 10;
	public B() {
		super(); // 상위클래스 생성자?A()
		System.out.println("B생성자");
	}
}
