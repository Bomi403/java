package chapter15;

class Student2 {
	/**
	 * 1.인스턴스의 생성 
	 * 2.멤버변수의 초기화
	 * 3. 반환값 X
	 */
	public Student2() { } // default 생성자 -> 컴파일 될때
	
	
	
	public void print() {
		System.out.println("Stuent Class");
	}
}


public class Ex7 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.print();
	}
}
