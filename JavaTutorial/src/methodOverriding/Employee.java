package methodOverriding;

public class Employee {
	protected String name, surname, email;

	public Employee(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
	public void TurnstileGateCardReaderEntrance() {
		System.out.println(this.name + " Entered");
	}
	
	public void TurnstileGateCardReaderExit() {
		System.out.println(this.name + " Exit");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public static void listEnterence(Employee[] enterence) {
		for(Employee e : enterence) {
			e.TurnstileGateCardReaderEntrance();
		}
	}
	
	
}
