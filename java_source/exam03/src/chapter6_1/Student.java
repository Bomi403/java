package chapter6_1;

public class Student {
	private int studentID; // 학번
	private String name; // 학생 이름
	
	public Student() {
		this(1000, "이름없음");
		studentID = 2000;
	}
	
	public Student(int studentID, String name) { 
		this.studentID = studentID;
		this.name = name;
	}
	
	public  Student setStudentID(int studentID) {
		this.studentID = studentID;
		
		return this;
	}
	
	public Student setName(String name) {
		this.name = name;
		
		return this;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + studentID + ", 이름 : " + name);
	}
}
