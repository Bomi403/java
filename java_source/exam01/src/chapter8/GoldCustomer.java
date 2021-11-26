package chapter8;

public class GoldCustomer extends Customer {
	
	private double discountRatio;
	
	public GoldCustomer(int CustomerID, String CustomerName) {
		super(CustomerID, CustomerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		discountRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		int _price =  super.calcPrice(price);
		int discount = (int)(_price * discountRatio);
		
		return _price - discount;
	}
	
	
}
