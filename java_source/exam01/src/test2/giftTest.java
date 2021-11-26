package test2;

import java.io.IOException;

public class giftTest {
	public static void main(String[] args) throws IOException {

		System.out.println("선물을 나눠줄 방법을 선택하세요");
		System.out.println("A : 줄 선 순서대로");
		System.out.println("B : 사람이 적은 줄 먼저");
		System.out.println("C : 단골손님 먼저 ");

		int ch = System.in.read();
		Gift gift = null;
		
		if(ch == 'A'|| ch== 'a') {
			gift = new Procedure();
		}
		else if( ch == 'B' || ch =='b') {
			gift = new FewPeople();
		}
		else if( ch == 'C' || ch =='c') {
			gift = new Priority();
		}
		else {
			System.out.println("없는 방법입니다.");
			return;
		}
		
		gift.getNextperson();
		gift.sendgiftAgent();
	}	
}