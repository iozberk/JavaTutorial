package interfaceOOP;

public class ItDepartment implements IEmployee{
	private String name, surname, role;
	
	public ItDepartment(String name, String surname, String role) {
		//super();
		this.name = name;
		this.surname = surname;
		this.role = role;
		System.out.println(this.companyName);
	}

	
	@Override
	public void enterence() {
		System.out.println(this.name + " has entered.");
	}

	@Override
	public void exit() {
		System.out.println(this.name + " is out.");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
