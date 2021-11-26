
import java.io.*;
import java.net.*;

public class Ex2 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com");
		
		//URLConnection conn = url.openConnection();
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		if ( conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
			try (InputStream in = conn.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr)) {
				
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
