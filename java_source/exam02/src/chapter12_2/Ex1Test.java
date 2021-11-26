package chapter12_2;

public class Ex1Test {
	public static void main(String[] args) {
		Ex1<String> ex1 = new Ex1<>();
		
		ex1.setData("≈ÿΩ∫∆Æ");
		
		String text = ex1.getData();
		System.out.println(text);
		
		double result1 = ex1.<Integer, Double>add(100, 30.5);
		System.out.println(result1);
		byte n1 = 10;
		short n2 = 20;
		double result2 = ex1.<Byte, Short>add(n1, n2);
		System.out.println(result2);
		
		double result3 = ex1.add(10, 20.3f);
		System.out.println(result3);
		
		double result4 = Ex1.<Integer, Double>minus(100, 10.5);
		System.out.println(result4);
	}
}
