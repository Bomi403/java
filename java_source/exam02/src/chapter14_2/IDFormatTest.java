package chapter14_2;

public class IDFormatTest {
	private String userID;
	private String password;
	
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		/** 
		 * 1. null 값이 되면 안되는 조건(O) 
		 * 2. 자리수 8~20(O)
		 */

		if (userID == null) {
			throw new IDFormatException("아이디가 null 입니다.");
		}
		
		if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8~20자리로 입력하세요.");
		}
		
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		/*
		 * 1) 비밀번호가 null(O)
			2) 문자열로만 이뤄진 경우 
			3) 5자 이하인 경우
		 */
		if (password == null) {
			throw new PasswordException("비밀번호가 null이면 안되요");
		}
		
		if (password.matches("[a-zA-Z]+") && password.matches("[!@#$%^&*]+") && password.matches("[0-9]+")) {
			throw new PasswordException("문자열 이외에 특수문자 또는 숫자도 함께 입력");
		}
		
		if (password.length() <= 5) {
			throw new PasswordException("비밀번호는 6자리 이상");
		}
		
		this.password = password;
	}
	
	public static void main(String[] args) {
		IDFormatTest ex = new IDFormatTest();
		// 아이디 null X, 자리수는 8~20
		String userID = null;
		try {
			ex.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		userID = "abcd";
		try {
			ex.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		String password = null;
		try {
			 password = null;
			ex.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e);
		}
		
		try {
			password = "abcd123!";
			ex.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e);
		}
	}
}
