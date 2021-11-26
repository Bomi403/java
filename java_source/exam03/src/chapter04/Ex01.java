package chapter04;

public class Ex01 {
	public static void main(String[] args) {
		char grade;
		int score = 80;
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) { // score >= 80 && score < 90
			grade = 'B';
		} else if (score >= 70) { // score >= 70 && score < 80
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}
