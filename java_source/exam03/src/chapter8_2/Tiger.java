package chapter8_2;

public class Tiger extends Animal {
	@Override 
	void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	
	void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
