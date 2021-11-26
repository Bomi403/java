package dateex;

import java.net.*;
import java.io.*;

public class Ex3 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com");
		
		InputStream in = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		in.close();
		
	}
}
