package chapter9_3;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("AI가 알아서 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("AI가 알아서 멈춥니다.");
	}

}
