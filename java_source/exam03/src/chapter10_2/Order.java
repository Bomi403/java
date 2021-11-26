package chapter10_2;

public class Order implements Buy, Sell {
	public void buy() { //  접근제어자 -> 재정의 -> 가시성이 동일, 현재 가시성보다 큰걸로만 재정의
		System.out.println("Buy!");
	}
	
	public void sell() {
		System.out.println("Sell!");
	}

	@Override
	public void order() {
	}
}
