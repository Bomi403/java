package chapter13_4;

public class Q5 {
	public static void main(String[] args) {
		Calc calc = (x, y) -> x + y;
		System.out.println(calc.add(10, 30));
		
		Calc calc2 = new Calc() {
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(calc2.add(10, 30));
	}
}
