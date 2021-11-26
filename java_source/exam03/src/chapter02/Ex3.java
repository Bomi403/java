package chapter02;

public class Ex3 {
	final int NUM = 10;
	
	public static void main(String[] args) {
		//ex1, ex2 인스턴스는 힙의 각각 다른 영역에 생성
		Ex3 ex1 = new Ex3();  // NUM
		
		Ex3 ex2 = new Ex3();  // NUM
		
		System.out.println(ex1.NUM);
		System.out.println(ex2.NUM);
		
		
	}
}
