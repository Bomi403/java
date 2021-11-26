package chapter07_1;

public class Ex1 {
	public static void main(String[] args) {
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = tiger;
		animals[2] = eagle;
		
		for(Animal animal : animals) {
			animal.move();
			if (animal instanceof Human) {
				Human human1 = (Human)animal;
				human1.reading();
			} else if (animal instanceof Tiger) {
				Tiger tiger1 = (Tiger)animal;
				tiger1.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle1 = (Eagle)animal;
				eagle1.flying();
			}
			
		}
		

	}
}
