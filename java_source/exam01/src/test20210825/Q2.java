package test20210825;

public class Q2 {
	public static void main(String[] args) {
		// �л� 40��
		for (int i = 1; i <= 40; i++) {
			// ���ȣ ����
			int roomNo = i % 10;
			System.out.println("�л�" + i + ", ���ȣ " + roomNo + "��");
		}
	}
}