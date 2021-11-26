package chapter15_4;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Ex3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("nodejs.zip");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("nodejs_copied.zip");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long millis = System.currentTimeMillis();
		int i;
		while((i = bis.read()) != -1) {
			bos.write(i);
		}
		
		bos.flush();
		
		millis = System.currentTimeMillis() - millis;
		System.out.println("소요 시간 : " + millis + "ms");
		
		bos.close();
		bis.close();
	}
}
