package exam03;

import java.io.*;
import java.net.*;
import java.util.*;

public class Ex1 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://yonggyo.com/~webclass/test.php");
		HashMap<String, String> params = new HashMap<>();
		params.put("name", "james");
		params.put("message", "Hello World");
		
		StringBuilder postData = new StringBuilder();
		for(Map.Entry<String, String> param : params.entrySet()) {
			if (postData.length() != 0) postData.append("&");
			postData.append(URLEncoder.encode(param.getKey(),"UTF-8"));
			postData.append("=");
			postData.append(URLEncoder.encode(param.getValue(), "UTF-8"));
		}
		byte[] postDataBytes = postData.toString().getBytes("UTF-8");
		
		
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
		conn.setDoOutput(true);
		conn.getOutputStream().write(postDataBytes);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
		
		String inputLine;
		while((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
		
		in.close();
	}
}
