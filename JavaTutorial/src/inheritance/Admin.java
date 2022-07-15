package inheritance;

public class Admin extends User {
	public String adminName;
	public String adminEmail;
	
		
	
	public Admin(int userId, int password, boolean loginStatus) {
		super(userId, password, loginStatus);
		
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

		
	
}
