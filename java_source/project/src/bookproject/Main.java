package bookproject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		BookManager BM = new BookManager ();
		boolean str = true;
		
		while (str) {
			System.out.println("==========���� ���� �޴�==========");
			System.out.println("1. ���� ���� ���");
			System.out.println("2. ���� ID �˻�");
			System.out.println("3. ���� ���� ����");
			System.out.println("4. ���� ���� ����");
			System.out.println("5. ���� ���� ����");
			System.out.println("==============================");
			System.out.println("��ȣ�� �������ּ���.");
			
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
				System.out.println("���� ���� ���α׷��� �����մϴ�.");
				scanner.close();
				System.exit(0);
			 
				default:
					System.out.println("���� �޴��Դϴ�. �ٽ� �Է��� �ּ���.");
					break;
			}
		}
	}
}
