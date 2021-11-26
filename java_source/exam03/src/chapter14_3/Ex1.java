package chapter14_3;

public class Ex1 {
	public static void main(String[] args) {
		String memId = "abcdefg";
		String password = "1234";
		/*
		try {
			login(memId, password);
		} catch (MemberIDException e) {
			System.out.println(e.getMessage());
		} catch (MemberPassException e) {
			System.out.println(e.getMessage());
		}
		*/
		try {
			login(memId, password);
		} catch (MemberIDException |  MemberPassException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static boolean login(String memId, String password) throws MemberIDException, MemberPassException {
		/**
		 * 아이디 6자리 이상인지 체크 - 아니면 MemberIDException 발생 
		 */
		if (memId.length() < 6) {
			throw new MemberIDException("아이디는 6자리 이상 입력해 주세요.");
		}
		
		/**
		 *  비밀번호 6자리 이상인지 체크 - 아니면 MemberPassException 발생 
		 */
		if (password.length() < 6) {
			throw new MemberPassException("비밀번호 6자리 이상 입력해 주세요.");
		}
		
		return true;
	}
	
}
