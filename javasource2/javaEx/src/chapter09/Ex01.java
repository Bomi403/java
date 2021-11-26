package chapter09;

public class Ex01 {
	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		human.move();
		tiger.move();
		eagle.move();
		
		human.commonMethod();
	}
}
