package chapter4;

public class LoopEx3 {
	public static void main(String[] args) {
		int num = 0;
		while(true) { // �׻� �� �̹Ƿ� ���� �ݺ�
			System.out.println(num);
			if (num >= 1000) 
				break;
			
			num++;
		}
	}
}