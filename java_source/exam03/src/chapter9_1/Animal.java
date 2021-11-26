package chapter9_1;

public abstract class Animal {
	public String text = "Animal";
	
	abstract void move(); // 구현 부분은 각각의 동물군에서 구현을 하면 된다 
	
	void showInfo() {
		System.out.println("Animal");
	}
}
