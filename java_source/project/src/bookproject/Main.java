package bookproject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		BookManager BM = new BookManager ();
		boolean str = true;
		
		while (str) {
			System.out.println("==========도서 관리 메뉴==========");
			System.out.println("1. 도서 정보 등록");
			System.out.println("2. 도서 ID 검색");
			System.out.println("3. 도서 정보 수정");
			System.out.println("4. 도서 정보 삭제");
			System.out.println("5. 도서 관리 종료");
			System.out.println("==============================");
			System.out.println("번호를 선택해주세요.");
			
			String menu = scanner.nextLine();
			
			switch (menu) {
			case ("1"):
				BM.bookAdd();
			 break;
			 
			case ("2"):
				BM.bookSearch();
			 break;
			 
			case ("3"):
				BM.bookEdit();
			 break;
			 
			case ("4"):
				BM.bookDelete();
			 break;
			 
			case ("5"):
				System.out.println("도서 관리 프로그램을 종료합니다.");
				scanner.close();
				System.exit(0);
			 
				default:
					System.out.println("없는 메뉴입니다. 다시 입력해 주세요.");
					break;
			}
		}
	}
}
