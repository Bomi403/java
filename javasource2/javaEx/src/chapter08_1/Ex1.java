package chapter08_1;

public class Ex1 {
	public static void main(String[] args) {
		Animal human = new Human();
		Human human2 = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		human.move();
		tiger.move();
		eagle.move();
		
		human.eat("밥");
		human.name = "이름1";
		human2.name = "이름2";
		human2.eat("피자");
	}
}
