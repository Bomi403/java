package chapter05_06_1;

public class Ex2 {
	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		System.out.println("com1 : " + com1);
		System.out.println("com2 : " + com2);
	}
}
