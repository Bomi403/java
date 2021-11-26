package exam01;

import java.net.*;
import java.io.*;

public class Ex2 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.naver.com");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		InputStream in;
		int code = conn.getResponseCode();
		if (code == HttpURLConnection.HTTP_OK) {
			in = conn.getInputStream();
		} else {
			in = conn.getErrorStream();
		}
		
		try (in;
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr)) {
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
