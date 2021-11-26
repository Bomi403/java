
import java.net.*;
import java.io.*;

public class Ex1 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://www.naver.com");
		
		try ( InputStream in = url.openStream();
				InputStreamReader isr = new InputStreamReader(in);
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
