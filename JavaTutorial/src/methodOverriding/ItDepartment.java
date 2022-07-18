package methodOverriding;

public class ItDepartment extends Employee{
	protected String subDepartment, title, programmingLanguage;

	public ItDepartment(String name, String surname, String email, String subDepartment, String title,
			String programmingLanguage) {
		super(name, surname, email);
		this.subDepartment = subDepartment;
		this.title = title;
		this.programmingLanguage = programmingLanguage;
	}

	public String getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
	
	
	
}
