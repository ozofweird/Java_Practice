package exceptionPractice;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDFormatTest idTest = new IDFormatTest();
		
		String id = null;
		try {
			idTest.setUserID(id);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		String myId = "12345";
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
