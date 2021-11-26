package chapter10;

public class ClassA implements InterA, InterB {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("Method A");
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void instanceMethod() {
		// TODO Auto-generated method stub
		InterA.super.instanceMethod();
	}
}
