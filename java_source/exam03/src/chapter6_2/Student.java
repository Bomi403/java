package chapter6_2;

public class Student<T extends Transportation> {
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void ride(Transportation trans) {
		int fare = trans.getFare();
		this.money -= fare;
		trans.collect(); // ¿ä±İ Â¡¼ö, ½Â°´ ¼ö Áõ°¡
		//trans.method();
		
		// T -> Object -> ÀÔ·ÂµÈ Çü
		/*
		if (trans instanceof Bus) {
			Bus bus = (Bus)trans;
			bus.method();
		} else if (trans instanceof Subway) {
			Subway sub = (Subway)trans;
			sub.method();
		}
		*/
	}
	
	public void showInfo() {
		System.out.println("ÀÌ¸§ : " + name + ", ÀÜ¾× : " + money);
	}
}
