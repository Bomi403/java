package chapter09_1;

public abstract class Car {
	public void start() {
		System.out.println("시동을 겁니다.");
	}
	
	public abstract void drive();
	public abstract void off();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	final public void run() {
		start();
		drive();
		off();
		stop();
	}
}
