package chapter12_1;

public class Ex4 {
	public static void main(String[] args) {
		GenericOperator oper = new GenericOperator();
		double result = oper.<Integer, Double>add(100, 20.234);
		System.out.println(result);
		
		double result2 = oper.<Float, Long>add(10.2f, 20000L);
		System.out.println(result2);
		
		double result3 = oper.add(100, 200);
		System.out.println(result3);
		
		double result4 = GenericOperator.<Integer, Double>addStatic(100, 20.0);
		System.out.println(result4);
	}
}
