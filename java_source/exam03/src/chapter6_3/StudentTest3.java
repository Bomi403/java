package chapter6_3;

public class StudentTest3 {
	public static void main(String[] args) {
		Student st1 = new Student();
		//System.out.println("st1 : " + st1.getSerialNum()); // 1001
		System.out.println("st1 : " + st1.getStudentID()); // 1001
		Student st2 = new Student();
		//System.out.println("st1 : " + st1.getSerialNum()); // 1001
		//System.out.println("st2 : " + st2.getSerialNum()); // 1002
		System.out.println("st1 : " + st1.getStudentID()); // 1001
		System.out.println("st2 : " + st2.getStudentID()); // 1002
		
		System.out.println(st1.NUM);
		System.out.println(st2.NUM);
		
		// 인스턴스를 생성 하든 안하든 NUM는 무조건 100
		
	}
	
}
