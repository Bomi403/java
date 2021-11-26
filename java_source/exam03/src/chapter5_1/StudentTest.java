package chapter5_1;

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		//System.out.println(st1);
		st1.studentID = 1001;
		st1.name = "이름1";
		System.out.println(st1.studentID + ", " + st1.name);
		
		Student st2 = new Student();
		st2.studentID = 1002;
		st2.name = "이름2";
		System.out.println("st2 : " + st2.studentID + ", " + st2.name);
		
		Student st3 = st2; // st2의 주소를 대입
		st3.studentID = 1003;
		st3.name = "이름3";
		System.out.println("st3 : " + st3.studentID + ", " + st3.name);
		System.out.println("st2 : " + st2.studentID + ", " + st2.name);
		
		//st2 = null;
		st2 = st1;
		
	}
}
