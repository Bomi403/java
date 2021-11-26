package chapter5_2;

public class Student {
	static int serialNum = 1000; // 일련번호 // 정적(고정 - 공유) // 데이터 영역 
	int studentID; // 멤버 변수 -> 힙 영역 
	
	Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	int getStudentID() {
		return studentID;
	}
	
	void method() {
		staticMethod();
		serialNum = 10;
		System.out.println("인스턴스 메서드");
	}
	
	static void staticMethod() {
		//method();
		//studentID = 10;
		System.out.println("정적 메서드");
	}
	
}
