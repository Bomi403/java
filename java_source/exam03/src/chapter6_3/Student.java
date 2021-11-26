package chapter6_3;

public class Student {
	public static int serialNum = 1000; // 일련번호 
	public int studentID; // 학번 
	public String name; // 이름
	public final int NUM = 100;
	
	
	public Student() {
		studentID = ++serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public static int getSerialNum() {
		// 멤버 변수, 인스턴스 메서드 -> 사용 할 수 있는가?
		//studentID = 100;
		return serialNum;
	}
	
	public void showInfo() {
		// 정적 변수, 정적 메서드 접근이 가능한가?		
		System.out.println("학번 : " + studentID + ", 이름 : " + name);
	}
}
