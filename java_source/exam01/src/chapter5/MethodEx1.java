package chapter5;

public class MethodEx1 {
	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
		
		printMessage("�޼��� ���!");
	}
	
	static int sum(int x) {
		int result = x * 2 + 2;
		return result;
		//System.out.println("�ϴ� ��� �׽�Ʈ");
	}
	
	static void printMessage(String msg) {
		System.out.println(msg);
	}
}