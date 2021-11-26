package chapter6_2;

public class TransTest {
	public static void main(String[] args) {
		Student<Bus> s1 = new Student<Bus>("학생1", 5000);
		Student<Bus> s2 = new Student<Bus>("학생2", 10000);
		
		Bus bus100 = new Bus("100", 1450);
		
		s1.ride(bus100);
		s2.ride(bus100);
		
		s1.showInfo();
		s2.showInfo();
		
		bus100.showInfo();
		/*
		Subway subIncheon = new Subway("인천메트로2호선", 1450);
		s1.ride(subIncheon);
		s2.ride(subIncheon);
		
		subIncheon.showInfo();
		*/
	}
}
