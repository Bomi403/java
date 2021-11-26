package chapter10_6;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer c = new Customer();
		Buy buy = c;
		Sell sell = c;
		
		System.out.println("Buy");
		buy.showInfo();
		
		System.out.println("Sell");
		sell.showInfo();
	}
}
