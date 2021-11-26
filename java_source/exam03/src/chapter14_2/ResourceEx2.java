package chapter14_2;

public class ResourceEx2 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("ResourceEx2 ´Ý±â...");
	}
}
