package test2;

public class FewPeople implements Gift {

	@Override
	public void getNextperson() {
		System.out.println("줄을 선 순서대로 손님에게 선물을 나눠줍니다.");
	}

	@Override
	public void sendgiftAgent() {
		System.out.println("현재 가장적은 인원 줄 손님에게 선물을 나눠줍니다.");
		
	}
	
}
