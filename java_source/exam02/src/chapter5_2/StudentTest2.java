package chapter5_2;

public class StudentTest2 {
	public static void main(String[] args) {
		Student s1 = new Student(); // 1001
		Student s2 = new Student(); // 1002 
	//	System.out.println("s1.serialNum = " + s1.serialNum);
	// System.out.println("s2.serialNum = " + s2.serialNum);
		System.out.println(Student.serialNum);
		System.out.println("s1.studentID = " + s1.getStudentID());
		System.out.println("s2.studentID = " + s2.getStudentID());
	}
}
