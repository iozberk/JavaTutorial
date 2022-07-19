package methodOverriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareDevelopment softwareEngineer = new SoftwareDevelopment("John", "Doe", "johndoe@gmail.com", "Backend", "Senior Developer", "C++", "Team Lead");
		Infrastructure infrastructureEngineer = new Infrastructure("Jennifer", "Doe", "jenniferdoe@gmail.com", "Front end", "Senior Manager", "C++, C#", "Software Development Manager");
		System.out.println("Regular method");
		infrastructureEngineer.TurnstileGateCardReaderEntrance();
		System.out.println("---------------------------");
		System.out.println("Overridden method");
		softwareEngineer.TurnstileGateCardReaderEntrance();
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		
		Employee employee = new SoftwareDevelopment("Java OOP","b","c","d","e","f","Polymorphism Method: ");
		employee.TurnstileGateCardReaderEntrance();
	}

}
