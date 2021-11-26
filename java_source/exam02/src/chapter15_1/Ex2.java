package chapter15_1;

import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		try {
			System.out.print("문자 1개를 입력하세요 : ");
			int i = System.in.read(); 
			/**
			 *  byte -> unsigned byte (0을 포함한 양수)
			 *  -128~127
			 *  unsigned 0~255
			 *  전부 다 읽은 경우 -1을 반환 
			 *  int(4byte) -> char(2byte) 
			 */
			
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
