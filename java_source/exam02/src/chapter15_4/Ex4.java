package chapter15_4;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Ex4 {
	public static void main(String[] args)  {
		try (FileReader fr = new FileReader("output2.txt");     
			 BufferedReader br = new BufferedReader(fr);
			 FileWriter fw = new FileWriter("ouput2_copied.txt");
			 BufferedWriter bw = new BufferedWriter(fw)) {
			int i;
			while ((i = br.read()) != -1) {
				bw.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
