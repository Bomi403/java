package dateex;

import java.util.regex.*;

public class Ex2 {
	public static void main(String[] args) {
		String cellPhone = "010-3481-2101";
		cellPhone = cellPhone.replaceAll("[^\\d]", "");
		
		String text = "ABCDEFG";
		Pattern pattern = Pattern.compile("([\\d]{3})([\\d]{4})([\\d]{4})", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(cellPhone);
		m.find();
		
		System.out.println(m.group(1));
		System.out.println(m.group(2));
		System.out.println(m.group(3));
	}
}
