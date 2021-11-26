package chapter11;

public class Ex3 {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "이름1");
		Student s2 = new Student(1000, "이름1");
		//Student s3 = s1;// 주소만 복사
		//Student s3 = new Student(s1.getTitle(), s1.getPrice());
		
		System.out.println("s1 : " + System.identityHashCode(s1));
		System.out.println("s2 : " + System.identityHashCode(s2));
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}
