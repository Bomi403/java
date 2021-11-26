package chapter7_1;

public class Ex4 {
	public static void main(String[] args) {
		String[] texts = new String[3];
		texts[0] = "ABC";
		texts[1] = "DEF";
		texts[2] = "GHI";
		//texts[3] = "JKL";
		
		String[] texts2 = new String[6]; // 기존 공간을 확장 X -> 큰 공간의 새로운 배열을 생성
		for (int i = 0; i < texts.length; i++) {
			texts2[i] = texts[i]; // 기존 값을 복사 
		}
		
		texts2[3] = "JKL"; // 데이터를 추가 
		texts2[4] = "OPQ";
		texts2[5] = "RST";
		//texts2[6] = "UVW";
		String[] texts3 = new String[20];
		for(int i = 0; i < texts2.length; i++) {
			texts3[i] = texts2[i];
		}
		texts3[6] = "UVW";  // 입력되어 있는 값 -> 7개 
		System.out.println(texts3.length);
		
		for (int i = 0; i < texts3.length; i++) {
			System.out.println(texts3[i]);
		}
		
		
	}
}
