package chapter04;

public class Ex03 {
	public static void main(String[] args) {
		int rank = 5;
		char medal = ' ';
		switch(rank) {
			case 1 : 
				medal = 'G';
				break;
			case 2: 
				medal = 'S';
				break;
			case 3: 
				medal = 'B';
				break;
			default : 
				medal = 'A';
		}
		System.out.println(medal);
	}
}
