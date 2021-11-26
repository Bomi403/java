package chapter8_2;

import java.util.ArrayList;

public class Ex3Test {
	public static void main(String[] args) {
		Human human = new Human(); // Human 인스턴스 + Animal  인스턴스, Human, Animal 자료형 
		Tiger tiger = new Tiger(); // Tiger 인스턴스 + Animal 인스턴스 Tiger, Animal 자료형
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(human);
		list.add(tiger);
		
		for (Animal animal : list) {
			animal.move();
			if (animal instanceof Human) {
				Human human1 = (Human)animal; // 다운 캐스팅
				human1.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger1 = (Tiger)animal;
				tiger1.hunting();
			}
		}
		
	}
}
