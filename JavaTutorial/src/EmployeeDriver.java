
public class EmployeeDriver {

	public static void main(String[] args) {
		System.out.println("--- Employee 1 ---");
		OOPEmployee employee1 = new OOPEmployee("John Doe", 2250.0, 45, 1992);
		employee1.toString();
		System.out.println("--- Employee 2 ---");
		OOPEmployee employee2 = new OOPEmployee("Jennifer Doe", 2500.0, 40, 1990);
		employee2.toString();
	}

}
