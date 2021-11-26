package chapter13_2;

public class LambdaEx1 {
	public static void main(String[] args) {
		AddNumber num = (x, y) -> x + y;
		System.out.println(num.add(10, 30));
		
		// num -> AddNumber 
		
		AddNumber num2 = new AddNumber() {
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(num2.add(10, 30));
		
		
	}
}
