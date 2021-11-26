package chapter8_2;

import java.util.ArrayList;

public class AnimalTest2 {
	public static void main(String[] args) {
		ArrayList<Object> animals = new ArrayList<Object>();
		animals.add(new Human());
		animals.add(new Tiger());
		animals.add(new Eagle());
		
		for (Object animal : animals) {
			if (animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
	}
}
