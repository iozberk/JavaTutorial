package methodOverriding;

public class Infrastructure extends ItDepartment{
	String tools;

	public Infrastructure(String name, String surname, String email, String subDepartment, String title,
			String programmingLanguage, String tools) {
		super(name, surname, email, subDepartment, title, programmingLanguage);
		this.tools = tools;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}
	
	
	
	
}
