package chapter14_3;

import java.io.*;

public class Ex2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("b.txt");
			// throw new FileNotFoundException("지정....");
			/*
			 * // FileNotFoundException e = new FileNotFoundException(....)
			 * IOException e = new FileNotFoundException(.....)
			 * Exception e = new FileNotFoundException(....)
			 *  Throwable e = new FileNotFoundException( .... )
			 */
		} catch (Exception e) { // 예외가 어떤게 발생할지 잘 예측이 안될때 
			e.printStackTrace();
		}
	}
}
