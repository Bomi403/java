package chapter10;

public class Ex2 {
	public static void main(String[] args) {
		A a = new A();
		InterA intera = a;
		InterC interc = a;
		InterD interd = a;
		
		if (interd instanceof A) {
			A aa = (A)interd;
			
		}
		
		InterD d = new InterD() {
			public int sumD(int num1, int num2) {
				return num1 + num2;
			}
		};
		int result = d.sumD(10, 20);
		System.out.println(result);
		
	}
}
