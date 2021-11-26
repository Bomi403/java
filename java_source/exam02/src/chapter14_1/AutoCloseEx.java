package chapter14_1;

public class AutoCloseEx implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Resource «ÿ¡¶...");
	}
}
