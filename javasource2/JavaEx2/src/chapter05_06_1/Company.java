package chapter05_06_1;

public class Company {
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		return instance;
	}
}
