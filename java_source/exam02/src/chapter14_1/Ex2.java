package chapter14_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.java");
		} catch (IOException e) {
			e.printStackTrace();
			return; // return으로 함수 종료해도 finally는 실행된다. - 함수 종료 시켜도 finally는 무조건 실행 
 		} finally {
			try {
				fis.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			// 예외, 오류가 발생하든 안하든 무조건 실행되는 영역
			System.out.println("무조건 실행");
		}
		
		System.out.println("출력!");
	}
}
