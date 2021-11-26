package chapter11_2;

public class WrapperEx1 {
	public static void main(String[] args) {
		int num1 = 100;
		Integer num2 = Integer.valueOf(200);
		
		int num3 = num1 + num2;
								     // Integer -> int -> ¾ğ ¹Ú½Ì
		
		System.out.println(num3);
		
		Integer num4 = num1;  // int -> Integer -> ¿ÀÅä ¹Ú½Ì 
		System.out.println(num4.hashCode());
		
		//System.out.println(num1 + num2);
	}
}
