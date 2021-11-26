package chapter04;

public class Ex05 {
	public static void main(String[] args) {
		int num = 1; // 초기화 
		int total = 0;
		while(num <= 100) { // 조건식
			total += num;
			
			num++; // 증감식
		}
		
		System.out.println(total);
	}
}
