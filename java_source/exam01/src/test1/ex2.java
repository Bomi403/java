package test1;

public class ex2 {
	public static void main(String[] args) {
		String[] students = new String[40];
		 for (int p = 0; p < students.length; p++) {
			 students[p] = "�л�" + (p + 1);
		 }
		
		 for (int p = 1; p <= students.length; p++) {
			 int room = p % 10; 
			 System.out.println(students[p-1] + ", ���ȣ " + room + "��");
		 }
		 
		
	}
}

