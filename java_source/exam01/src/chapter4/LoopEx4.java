package chapter4;

public class LoopEx4 {
	public static void main(String[] args) {
		int num = 1;
		while(num <= 100) {
			if (num % 2 == 1) { // Ȧ�� -> �ǳʶٱ�
				num++;
				continue;
			}
			
			System.out.println(num);
			num++;
		}
	}
}
