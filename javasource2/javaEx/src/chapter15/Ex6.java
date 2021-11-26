package chapter15;

import java.io.*;

public class Ex6 {
	public static void main(String[] args) {
		try (RandomAccessFile rf = new RandomAccessFile("data.txt", "rw")) {
			rf.writeInt(100);
			System.out.println("위치 : " + rf.getFilePointer());
			
			rf.writeUTF("안녕하세요!");
			System.out.println("위치 : " + rf.getFilePointer());
			
			rf.writeBoolean(false);
			System.out.println("위치 : " + rf.getFilePointer());
			
			rf.seek(0);
			
			System.out.println(rf.readInt());
			System.out.println("위치 : " + rf.getFilePointer());
			
			System.out.println(rf.readUTF());
			System.out.println("위치 : " + rf.getFilePointer());
			
			System.out.println(rf.readBoolean());
			System.out.println("위치 : " + rf.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
