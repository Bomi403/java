package chapter10_4;

public class Ex1 {
	InterfaceEx ex2 = new InterfaceEx() {
		public int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	public static void main(String[] args) {
		int num3 = 30; // 컴파일러가 -> public final -> 추가 -> 상수화
		InterfaceEx ex = new InterfaceEx() {
			 public int add(int num1, int num2) {
				return num1 + num2 + num3;
			}
		};
		
		System.out.println(ex.add(10, 30));
		
		Ex1 ex1 = new Ex1();
		System.out.println(ex1.ex2.add(30, 50));
	}
}
