package chapter5_1;

public class Student {
	int studentID; // 학번  // 기본 자료형 
	String name; // 학생이름 // 참조자료형 JDK 정의 기본 클래스
	Subject kor;
	
	
	public Student() {
		studentID = 1001;
		name = "이름1";
	}
	
	public Student(int sID, String nm) {
		studentID = sID;
		name = nm;
		kor = new Subject("국어", 60);
	}
	
	public void showInfo() {
		System.out.println("학번 : " + studentID + ", 이름 : " + name);
	}
}