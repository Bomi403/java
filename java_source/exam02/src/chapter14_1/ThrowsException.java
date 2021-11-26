package chapter14_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {
	public Class loadClass(String filename, String ClassName) throws FileNotFoundException, ClassNotFoundException  {
		// java.io.FileNotFoundException 
		FileInputStream fis = new FileInputStream(filename);
		
		// java.lang.ClassNotFoundException 
		 Class cls = Class.forName(ClassName);
		
		return cls;
	}
	
	public static void main(String[] args)  {
		ThrowsException ex = new ThrowsException();

		try {
			ex.loadClass("test.java", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
