package chapter10;

public class Ex1 {
	public static void main(String[] args) {
		A a = new A();
		int result = a.sumA(10, 20);
		System.out.println(result);
		int result2 = a.minus(30, 20);
		System.out.println(result2);
		
		InterA.print();
	}
}
