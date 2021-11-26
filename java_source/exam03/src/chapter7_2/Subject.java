package chapter7_2;

public class Subject {
	private String title;
	private int score;
	
	public Subject(String title, int score) {
		this.title = title;
		this.score = score;
	}
	
	public void showSubjects() {
		System.out.println("과목 : " + title + ", 점수 : " + score);
	}
}
