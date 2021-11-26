package chapter10_2;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.buy();
		order.sell();
		
		order.order();
		
		Buy.showInfo();
		
		System.out.println("------ Buy ------");
		Buy buy = order;
		buy.buy();
		
		Order order2 = (Order)order;
		
		System.out.println("------ Sell ------");
		Sell sell = order;
		sell.sell();
	}
}
