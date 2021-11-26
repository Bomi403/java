package chapter6_1;

public class StudentTest {
	public static void main(String[] args) {
		// 학생 -> 생성 -> 학번이 자동 증감(serialNum - static)
		// 학번은 자동 증가하고 발급 -> 발급 된 시점의 학번이 계속 유지.
		Student st1 = new Student(); // 1
		Student st2 = new Student(); // 2
 		Student st3 = new Student(); // 3
		System.out.println("st1 학번 = " + st1.getStudentID());
		System.out.println("st2 학번 = " + st2.getStudentID());
		System.out.println("st3 학번 = " + st3.getStudentID());
		
		int sum = 0;
		 
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
	}
}
