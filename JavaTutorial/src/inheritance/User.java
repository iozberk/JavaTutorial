package inheritance;

public class User {
	private int userId;
	private int password;
	private boolean loginStatus;
	

	public User(int userId, int password, boolean loginStatus) {
		super();
		this.userId = userId;
		this.password = password;
		this.loginStatus = loginStatus;
	}

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
