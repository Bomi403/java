package chapter6;

public class StaticEx1 {
	int num = 10;
	
	public static void main(String[] args) {
		StaticEx1 ex1 = new StaticEx1();
		System.out.println(ex1.num);
		
		//Student st1 = new Student("�̸�1", 1500);
		//Student st2 = new Student("�̸�2", 2000);
		
		Student.studentNum = 1000;
		System.out.println(Student.getStudentNum());
		
		//System.out.println(st1.getStudentNum());
		//System.out.println(st2.getStudentNum());
		// �ν��Ͻ��� ȣ�� -> �ν��Ͻ��� X -> ������ ����
		
		/*
		st1.studentNum = 1001;
		System.out.println("st2:" + st2.studentNum);
		st2.studentNum += 10;
		System.out.println("st1:" + st1.studentNum);
		*/
		System.out.print(Student.studentNum);
		
	}
}