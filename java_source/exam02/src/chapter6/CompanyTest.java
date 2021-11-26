package chapter6;

public class CompanyTest {
	public static void main(String[] args) {
		//Company c1 = new Company();
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println(c1 == c2);
	}
}
