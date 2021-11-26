package chapter09;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		ArrayList<Animal> list = new ArrayList<>();
		list.add(human); // Animal object = human;
		list.add(tiger);
		list.add(eagle);
		
		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			animal.move();
			if (animal instanceof Human) {
				Human h = (Human)animal;
				h.reading();
			} else if (animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			} else if (animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}
		}
	}
}
