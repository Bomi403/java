package chapter11_3;

public class Student implements Cloneable  { // 빈 인터페이스 -> 사용자가 clone을 사용할 지 여부 
	// Serializable -> 마커인터페이스(동의)
	private int studentID;
	private String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override 
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + name;
	}

	@Override
	public boolean equals(Object obj) { // Student st2
		Student student = (Student)obj;
		if (student.studentID == studentID) {
			return true;
		}
		
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		
		return studentID;
	}
}
