package chapter9;

public class DeskTop extends Computer {

	@Override
	void cpu() {
		System.out.println("데스크탑 CPU");
	}

	@Override
	void motherBoard() {
		System.out.println("데스크탑 메인보드");
	}

}
