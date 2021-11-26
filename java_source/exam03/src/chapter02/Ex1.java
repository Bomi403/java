package chapter02;

public class Ex1 {
	public static void main(String[] args) {
		float nun = 123.456F;
		long num = 12341212121212122L; 
		// timestamp -> 천분의 1초
		/** 
		 *  L -> 상수풀 접근시 -> 처음부터 long 상수풀로 접근 해달라
		 *  L이 없다면 int num = 12341212121212122; -> long num = (long)12341212121212122
		 */
		// int num = 12341212121212121212 -> (long)
		
		//Integer num1 = new Integer(10);
		//Integer num2 = new Integer(10);
		//System.out.println(System.identityHashCode(num1));
		//System.out.println(System.identityHashCode(num2));
		//System.out.println(num1 == num2);
		
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 == num2);
	}
}
