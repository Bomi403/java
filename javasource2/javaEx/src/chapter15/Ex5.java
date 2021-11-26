package chapter15;

import java.io.*;

public class Ex5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file = File.createTempFile("tmp_", ".tmp", new File("D:\\"));
		
		Thread.sleep(5000);
		
		file.deleteOnExit();
	}
}
