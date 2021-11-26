package chapter5_1;

public class Rice {
	private int amount; // 밥의 양
	
	public Rice(int amount) {
		this.amount = amount;
	}
	
	public void eaten(int oneSpoon) {
		amount -= oneSpoon;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void showInfo() {
		System.out.println("현재 남은 밥의 양 = " + amount + "g");
	}
}
