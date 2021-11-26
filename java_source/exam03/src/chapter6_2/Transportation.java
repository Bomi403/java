package chapter6_2;

public class Transportation {
	private String lineNo;
	private int fare;
	private int passengerCount;
	private int profit;
	
	public Transportation(String lineNo, int fare) {
		this.lineNo = lineNo;
		this.fare = fare;
	}
	
	public int getFare() {
		return fare;
	}
	
	public void collect() {
		profit += fare;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("³ë¼±¹øÈ£ : " + lineNo + ", ½Â°´ ¼ö : " + passengerCount + ", ¼öÀÍ : " + profit); 
	}
	
}
