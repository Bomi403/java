package chapter8;

public class Order {
	long orderNum;
	String memId;
	String orderDate;
	String memNm;
	String orderGoodsNum;
	String address;
	
	public void setOrder(long orderNum, String memId, String orderDate, 
	String memNm, String orderGoodsNum, String address) {
		this.orderNum = orderNum;
		this.memId = memId;
		this.orderDate = orderDate;
		this.memNm = memNm;
		this.orderGoodsNum = orderGoodsNum;
		this.address = address;
	}
	
	public void showInfo() {
		System.out.println("�ֹ���ȣ:"+orderNum);
		System.out.println("�ֹ��� ���̵�:"+memId);
		System.out.println("�ֹ� ��¥:"+orderDate);
		System.out.println("�ֹ��� �̸�:"+memNm);
		System.out.println("�ֹ� ��ǰ ��ȣ:"+orderGoodsNum);
		System.out.println("��� �ּ�:"+address);

		}
}