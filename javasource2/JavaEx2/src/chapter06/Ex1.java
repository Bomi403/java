package chapter06;

public class Ex1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 40;
		s1.name = "이름1";
		//s1.schoolId = 20211111;
		Student.schoolId = 20211111;
		
		s2.age = 20;
		s2.name = "이름2";
		//s2.schoolId = 20201111;
		Student.schoolId = 20201111;
		
		System.out.printf("s1 : AGE=%d,name=%s,Id=%d%n", s1.age, s1.name, s1.schoolId);
		System.out.printf("s2 : AGE=%d,name=%s,Id=%d", s2.age, s2.name, s2.schoolId);
		
		Student.staticPrint();
		
		s1.print();
	}
}
