package methodOverriding;

public class SoftwareDevelopment extends ItDepartment{
	String role;

	public SoftwareDevelopment(String name, String surname, String email, String subDepartment, String title,
			String programmingLanguage, String role) {
		super(name, surname, email, subDepartment, title, programmingLanguage);
		this.role = role;
	}
	
	
	public void TurnstileGateCardReaderEntrance() {
		System.out.println(this.role +": " + this.name + " Entered with Overridden method");
	}
	
	public void TurnstileGateCardReaderExit() {
		System.out.println(this.role +": " + this.name + " Exit");
	}
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
