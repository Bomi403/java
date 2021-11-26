package chapter14_2;

public class Ex4 {
	public static void main(String[] args) {
		ResourceEx1 res1 = new ResourceEx1();
		 ResourceEx2 res2 = new ResourceEx2();
		try(res1;res2) {
			throw new Exception("예외발생!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
