package chapter11_2;

public class StringEx2 {
	public static void main(String[] args) {
		String text1 = "ABC"; // 문자열 상수
		String text2 = "ABC";
		String text22 = "DEF";
		System.out.println(text1 == text2);
		System.out.println(text2 == text22);
		String text3 = new String("ABC"); // 상수 -> 변경 불가(현재 주소에 동일 문자열)
		String text4 = new String("ABC");
		System.out.println(text3 == text4);
	}
}
