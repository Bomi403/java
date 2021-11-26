package chapter10;

public interface InterB {
	int numB = 30;
	int sumB(int num1, int num2);// public abstract int sumB
	int sum(int num1, int num2);
	
	default int minus(int num1, int num2) {
		return num1 - num2;
	}
}
