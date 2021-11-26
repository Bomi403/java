package chapter09_1;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		
	}

	@Override
	public void off() {
		System.out.println("사람이 시동을 끕니다.");
		
	}
}
