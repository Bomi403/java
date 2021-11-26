package chapater10_1;

public interface A {
	int num = 10; // 멤버변수 -> 사용 불가 -> 인터페이스 -> 인스턴스 생성 X
					    //  상수 -> 컴파일러 -> public static final (정적 상수)
	void methodA(); // abstract 붙이지 않아도 -> 컴파일러 -> public abstract 
	void methodB(); 
}
