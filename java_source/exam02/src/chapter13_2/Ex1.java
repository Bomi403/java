package chapter13_2;

public class Ex1 {
	public static void main(String[] args) {
		MyCalc calc = (x, y) -> x + y;
		
		System.out.println(calc.add(100, 200));
	}
}
