package chapter14_1;

import java.io.*;

public class Ex1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			 fis = new FileInputStream("a.txt"); 
			// 리소스 열면 -> 닫아
			 isr = new InputStreamReader(fis);
			 br = new BufferedReader(isr);

		} catch (IOException e) {
			// 예외 처리 로직, 로그
			
		} finally {
			try {
				br.close();
				isr.close();
				fis.close();
			} catch (Exception e) {
				
			}
		}
		
		System.out.println("실행 되나요?");
	}
}
