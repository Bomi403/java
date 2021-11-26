package chapter15_4;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("nodejs.zip");
		FileOutputStream fos = new FileOutputStream("nodejs_copied.zip");
		
		long millis = System.currentTimeMillis();
		int i;
		while(( i = fis.read()) != -1) {
			fos.write(i);
		}
		
		millis = System.currentTimeMillis() - millis;
		System.out.println("소요 시간 : " + millis + "ms");
		
		fis.close();
		fos.close();
	}
}
