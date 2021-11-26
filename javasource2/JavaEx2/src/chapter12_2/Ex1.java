package chapter12_2;

public class Ex1 {
	public static void main(String[] args) {
		/*
		Calculator calc = new Calculator();
		double result = calc.<Integer, Double>sum(10, 20.5);
		System.out.println(result);
		double result2 = calc.sum(10, 20.5);
		System.out.println(result2);
		double result3 = calc.sum(10.13f, 100000000000L);
		System.out.println(result3);
		*/
		double result = Calculator.sum(100.12f, 10000);
		System.out.println(result);
	}
}
