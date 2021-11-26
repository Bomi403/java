package chapter9;

public class ComputerTest {
	public static void main(String[] args) {
		NoteBook n = new NoteBook(); // Computer 인스턴스 - NoteBook 인스턴스 
													   // NoteBook 자료형, Computer 자료형 
		DeskTop d = new DeskTop(); //  Computer 인스턴스 - DeskTop 인스턴스
													// DeskTop 자료형, Computer 자료형
		
		Computer[] computers = new Computer[2];
		computers[0] = n;
		computers[1] = d;
		
		
	}
}
