package chapter5;

public class MyDateTest {
	public static void main(String[] args) {
		/**
		 * date는 new MyDate() - 생성된 인스턴스의 주소
		 */
		MyDate date = new MyDate();
		System.out.println("date : " + date);
		
		//date.year = 2021;
		//date.month = -1;
		//date.day = -20;
		/*
		date.setYear(2021);
		date.setMonth(-1);
		date.setDay(-20);
		
		date.showDate();
		*/
	}
}
