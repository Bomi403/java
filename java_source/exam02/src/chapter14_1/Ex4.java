package chapter14_1;

public class Ex4 {
	public static void main(String[] args) {
		AutoCloseEx ex1 = new AutoCloseEx();
		AutoCloseEx2 ex2 = new AutoCloseEx2();
		try(ex1;ex2) {
			
			throw new Exception("오류 발생!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
