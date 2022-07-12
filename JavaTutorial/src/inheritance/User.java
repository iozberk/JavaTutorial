package inheritance;

public class User {
	private int userId;
	private int password;
	private boolean loginStatus;
	
	public void verifyLogin() {
		System.out.println("Login Status");
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
