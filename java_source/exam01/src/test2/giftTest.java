package test2;

import java.io.IOException;

public class giftTest {
	public static void main(String[] args) throws IOException {

		System.out.println("������ ������ ����� �����ϼ���");
		System.out.println("A : �� �� �������");
		System.out.println("B : ����� ���� �� ����");
		System.out.println("C : �ܰ�մ� ���� ");

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
			System.out.println("���� ����Դϴ�.");
			return;
		}
		
		gift.getNextperson();
		gift.sendgiftAgent();
	}	
}