package chapter10;

public class A implements InterA, InterB {
	public int sumA(int num1, int num2) {
		//System.out.println(InterA.numA);
		return num1 + num2;
	}
	
	public int sumB(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return InterB.super.minus(num1, num2);
	}

	@Override
	public int sumC(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int sumD(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
	
}
