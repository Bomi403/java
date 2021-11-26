package dateex;

import java.net.*;
import java.io.*;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com");
		
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		InputStream in;
		if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
			in = conn.getInputStream();
		} else {
			in = conn.getErrorStream();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		StringBuilder sb = new StringBuilder();
		String line;
		while((line = br.readLine()) != null) {
			sb.append(line);
		}
		System.out.println(sb.toString());
		br.close();
		in.close();
	}
}
