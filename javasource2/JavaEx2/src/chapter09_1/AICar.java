package chapter09_1;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI가 알아서 운전을 합니다.");
		
	}

	@Override
	public void off() {
		System.out.println("AI가 알아서 시동을 끕니다.");
		
	}

}
