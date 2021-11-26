package test2;

public class Priority implements Gift {

	@Override
	public void getNextperson() {
		System.out.println("단골손님 먼저 순서대로 선물을 나눠줍니다.");
	}

	@Override
	public void sendgiftAgent() {
		System.out.println("단골 손님이 아닌 손님분께 순서대로 선물을 나눠줍니다.");
	}
}
