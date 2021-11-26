package test1;

public class ex2 {
	public static void main(String[] args) {
		String[] students = new String[40];
		 for (int p = 0; p < students.length; p++) {
			 students[p] = "학생" + (p + 1);
		 }
		
		 for (int p = 1; p <= students.length; p++) {
			 int room = p % 10; 
			 System.out.println(students[p-1] + ", 방번호 " + room + "번");
		 }
		 
		
	}
}

