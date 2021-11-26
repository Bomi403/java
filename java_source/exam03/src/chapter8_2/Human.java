package chapter8_2;

public class Human extends Animal {
	@Override 
	void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
