package chapter15_4;

import java.io.IOException;
import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Ex5 {
	public static void main(String[] args) {
		try (
			FileOutputStream fos = new FileOutputStream("data.dat");
			DataOutputStream dos = new DataOutputStream(fos);	
			FileInputStream fis = new FileInputStream("data.dat");
			DataInputStream dis = new DataInputStream(fis)) {
			
			dos.writeInt(100);
			dos.writeBoolean(true);
			dos.writeUTF("æ»≥Á«œººø‰.");
			
			int num = dis.readInt();
			boolean bool = dis.readBoolean();
			String text = dis.readUTF();
			
			System.out.println("num = " + num);
			System.out.println("bool = " + bool);
			System.out.println("text = " + text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
