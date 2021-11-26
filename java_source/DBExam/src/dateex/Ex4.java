package dateex;

import java.net.*;
import java.io.*;

public class Ex4 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			try (InputStream in = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr)	) {
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				
			}
		} catch (IOException e) {
			
		}
	}
}
