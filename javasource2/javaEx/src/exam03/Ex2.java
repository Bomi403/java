package exam03;

import java.io.*;
import java.net.*;

public class Ex2 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://yonggyo.com/~webclass/test.php");
		
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		
		String params = "name=" + URLEncoder.encode("이름", "UTF-8") + "&message=" + URLEncoder.encode("안녕하세요.", "UTF-8");
		byte[] sendParams = params.getBytes("UTF-8");
		conn.setRequestProperty("Content-Length", String.valueOf(sendParams.length));
		
		conn.setDoOutput(true);
		OutputStream out = conn.getOutputStream();
		out.write(sendParams);
		out.close();
		
		InputStream in = conn.getInputStream();
		try(in;
			InputStreamReader isr = new InputStreamReader(in, "UTF-8");
			BufferedReader br = new BufferedReader(isr)) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
