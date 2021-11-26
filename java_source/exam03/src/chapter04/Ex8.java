package chapter04;

public class Ex8 {
	public static void main(String[] args) {
		parent : for (int i = 1; i <= 9; i++) { // 1´Ü ~ 9´Ü
			/*
			if (i > 5) {
				break; // ¹Ýº¹À» Áß´Ü
			}
			*/
			// Â¦¼ö ´Ü¸¸ -> È¦¼ö ´Ü -> °Ç³Ê ¶Ù±â
			/*
			if (i % 2 == 1) { // 2·Î ³ª´« ³ª¸ÓÁö°¡ 1 -> È¦¼ö -> °Ç³Ê¶Ù±â
				continue;
			}
			*/
			System.out.println("---- " + i + "´Ü ----");
			for (int j = 1; j <= 9; j++) {
				if (j % 2  == 0) continue parent;
				
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
}
