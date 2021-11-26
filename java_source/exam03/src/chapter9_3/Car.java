package chapter9_3;

public  abstract class Car {
	public abstract void drive(); // 일반 승용차(ManualCar -> 운전자 운전, 자율 주행차 -> AI 가 운전)
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동 켜기");
	}
	public void turnOff() {
		System.out.println("시동 끄기");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
