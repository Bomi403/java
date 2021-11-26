package chapter14_1;

public class AutoCloseEx2 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Resource «ÿ¡¶2....");
	}
}
