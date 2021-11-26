package chapter8_2;

public class Ex2Test {
	public static void main(String[] args) {
		Animal human = new Human(); // Human 인스턴스 + Animal 의 인스턴스
		Animal tiger = new Tiger(); // Tiger 인스턴스 + Animal 인스턴스
		
		Animal[] animals = new Animal[2];
		animals[0] = human;
		animals[1] = tiger;
		//humans[0] = new Tiger();
		
		
	}
}
