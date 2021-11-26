package chapter9_2;

//TV 클래스 -> 다른 클래스에서 공유 하기 위한 기능으로만 사용될 경우 
// 인스턴스 만들면 X -> abstract 
public abstract class TV { 
	void turnOn() {
		System.out.println("전원 켜기");
	}
	
	void turnOff() {
		System.out.println("전원 켜기");
	}
}
