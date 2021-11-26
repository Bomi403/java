package chapter9_1;

public class Eagle extends Bird {

	@Override
	void hatch() { // Bird 추상 메서드 
		System.out.println("Eagle Hatch");
	}

	@Override
	void move() { // Animal 
		System.out.println("독수리가 날아다닙니다.");
	}

}
