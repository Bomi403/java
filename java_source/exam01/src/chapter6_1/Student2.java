package chapter6_1;

public class Student2 {
	static int serialNum; 
	int studentID;
	int cardNum;
	
	public Student2() {
		studentID = ++serialNum;
		cardNum = studentID + 100;
	}
	
	public int getCardNum() {
		return cardNum;
	}
}
