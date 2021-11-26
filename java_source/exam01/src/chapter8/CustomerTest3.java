package chapter8;

import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		// 배열 - 동일자료형의 연속된 공간
		
		Customer c1 = new Customer(1000, "고객1");
		VIPCustomer2 vc = new VIPCustomer2(1001, "고객2", 1000); // Customer 인스턴스, VIP2Customer 인스턴스
		GoldCustomer gc = new GoldCustomer(1002, "고객3"); // Customer 인스턴스, GoldCustomer 인스턴스
		/*
		Customer[] list = new Customer[3];
		
		list[0] = c1;
		list[1] = vc;
		list[2] = gc;
		*/
		

		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(vc);
		list.add(gc);
		 
		for (Customer customer : list) {
			customer.showInfo();
			if (customer instanceof VIPCustomer2) {
				VIPCustomer2 vip = (VIPCustomer2)customer;
				System.out.println("AgentID : " + vip.getAgentID());
			}
		}
		
	}
}
