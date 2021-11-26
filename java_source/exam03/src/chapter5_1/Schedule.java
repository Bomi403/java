package chapter5_1;

public class Schedule {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int y) {
		if (y < 1) y = 1;
		year = y;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int m) {
		if (m < 1) m = 1;
		if (m > 12) m = 12;
		month = m;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int d) {
		if (d < 1) d = 1;
		if (d > 31) d = 31;
		if (month == 2 && d > 28) d = 28;
		
		day = d;
	}
	
	public int getDay() {
		return day;
	}
	
	void showInfo() {
		System.out.println(year + "-" + month + "-" + day);
	}
}