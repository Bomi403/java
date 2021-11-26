package chapter9_1;

public class Human extends Mammal {

	@Override
	void breads() { // Mammal
		System.out.println("Human Breads");
		
	}

	@Override
	void move() { // Animal 
		System.out.println("사람이 두발로 걷습니다.");
	}
}
