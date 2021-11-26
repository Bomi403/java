package chapter6_4;

public class CompanyTest {
	public static void main(String[] args) {
		/*
		Company c1 = new Company();
		Company c2 = new Company();
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		*/
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
	}
}
