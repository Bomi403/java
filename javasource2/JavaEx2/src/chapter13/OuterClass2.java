package chapter13;

public class OuterClass2 {
	public InterA get(int num3) {
		return (x, y) -> x + y + num3;
		
		
		/*
		return new InterA() {
			public int sum(int num1, int num2) {
				return num1 + num2 + num3;
			}
		};\
		*/
		
		
		
	}
	
	public static void main(String[] args) {
		//OuterClass2 out = new OuterClass2();
		//InterA in = out.get(30);
		//System.out.println(in.sum(10, 20));
	}
}
