package exam01;

import java.net.*;
import java.io.*;

public class Ex1 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.naver.com");
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		/*
		int i;
		while((i = br.read()) != -1) {
			System.out.print((char)i);
		}
		*/
		br.close();
		isr.close();
		in.close();
	}
}
