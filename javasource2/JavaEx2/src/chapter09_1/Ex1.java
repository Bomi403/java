package chapter09_1;

public class Ex1 {
	public static void main(String[] args) {
		ManualCar car1 = new ManualCar();
		
		AICar car2 = new AICar();
		
		System.out.println("--------------- Manual Car -----------");
		car1.run();
		
		System.out.println("--------------- AI Car -----------");
		car2.run();
		
	}
}
