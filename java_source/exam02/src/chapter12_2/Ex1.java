package chapter12_2;

public class Ex1<T> {
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	/*
	public  double add(V num1, K num2) {
		double n1 = ((Number)num1).doubleValue();
		double n2 = ((Number)num2).doubleValue();
		
		return n1 + n2;
	}
	*/

	public <T, V> double add(T num1, V num2) {
		double n1 = ((Number)num1).doubleValue();
		double n2 = ((Number)num2).doubleValue();
		
		return n1 + n2;
	}
	
	
	public static <T, V> double minus(T num1, V num2) {
		//Object nn1 = num1;
		//Number n1 = (Number)nn1;
		double n1 = ((Number)num1).doubleValue();
		double n2 = ((Number)num2).doubleValue();
		
		return n1 - n2;
	}
}
