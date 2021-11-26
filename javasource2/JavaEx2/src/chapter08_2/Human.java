package chapter08_2;

public class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("두발로 걷습니다.");
	}
	
	public void reading() {
		System.out.println("독서를 합니다.");
	}
}
