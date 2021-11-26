package chapter13_1;

public class Outer3 {
	public InterA method(int num3) { 
		 return new InterA() {
			public void print() {
				System.out.println("Ãâ·Â!");
			}
			
			public int sum(int num1, int num2) {
				return num1 + num2 + num3;
			}
		};
		
		
	}
}
