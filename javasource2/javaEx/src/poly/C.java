package poly;

public class C extends B {
	/**
	 * 생성자 메서드의 가장 중요한 목적(용도)
	 * 	- 인스턴스 생성 -> 힙에 메모리에 할당
	 *  - 스택 영역에서 실행
	 */
	public C() {
		super(); // 상위클래스의 생성자 메서드 호출(컴파일 될때 자동으로 추가)
		
		System.out.println("C생성자");
	}
}
