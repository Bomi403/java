package chapter8_1;

public class Ex2Test {
	public static void main(String[] args) {
		C c1 = new C();
		c1.numC = 20;
		//c1.method();
		System.out.println(c1.add(10, 20));
		
		C c2 = new C();
		c2.numC = 10;
		//c2.method();
		System.out.println(c2.add(30, 50));
	}
}
