package chapter11_5;

public class Ex1 {
	public static void main(String[] args) {
		int num = 13;
		System.out.println(Integer.toString(num, 2));
		System.out.println(Integer.toString(num, 8));
		System.out.println(Integer.toString(num, 16));
		
		Integer num1 = Integer.valueOf(num);
		Double num2 = Double.valueOf(num);
		
		
		// num1, num2 의 자료형을 모를때 -> 연산  -> 같은 종류 수로 변경
		Number num11 = num1;
		Number num22 = num2;
		
		Double result = num11.doubleValue() + num22.doubleValue();
		System.out.println(result);
		
	}
}
