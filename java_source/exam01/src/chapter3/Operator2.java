package chapter3;

public class Operator2 {
	public static void main(String[] args) {
		String[] students = new String[30];
		 for (int i = 0; i < students.length; i++) {
			 students[i] = "�л�" + (i + 1);
		 }
		
		 for (int i = 1; i <= students.length; i++) {
			 int room = i % 10; // (0 ~ 9) �濡 ����
			 System.out.println(students[i-1] + "�� ���ȣ " + room + "�Դϴ�.");
		 }
		 
		
	}
}