package chapter9_3;

public class Ex1Test {
	public static void main(String[] args) {
		ManualCar mcar = new ManualCar();
		AICar acar = new AICar();
		
		
		mcar.run();
		System.out.println("----------------------------------------------");
		acar.run();
	}
}
