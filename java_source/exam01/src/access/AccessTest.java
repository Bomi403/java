package access;

import chapter5.AccessEx1;

public class AccessTest extends AccessEx1 {
	public AccessTest() {
		System.out.println(num4); // protected는 상속을 받으면 내부에서만 접근 가능(private)
	}
	public static void main(String[] args) {
		AccessTest t = new AccessTest();
		AccessEx1 ex1 = new AccessEx1();
		System.out.println(ex1.num1);
		
		//System.out.println(ex1.num2);
		
	}
}
