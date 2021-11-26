package chapter9_3;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아서 차를 멈춥니다.");
	}
}
