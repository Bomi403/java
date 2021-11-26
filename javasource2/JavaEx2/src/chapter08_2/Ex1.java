package chapter08_2;

public class Ex1 {
	public static void main(String[] args) {
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		Animal[] animals = new Animal[3];
		animals[0] = human;
		animals[1] = eagle;
		animals[2] = tiger;
		
		for (Animal animal : animals) {
			animal.move();
			if (animal instanceof Human) {
				Human h = (Human)animal;
				h.reading();
			}
		} 
		
	}
}
