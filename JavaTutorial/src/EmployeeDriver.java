
public class EmployeeDriver {

	public static void main(String[] args) {
		OOPEmployee employee1 = new OOPEmployee("John Doe", 2000.0, 45, 1992);
		System.out.println("Tax: " + employee1.tax());
		System.out.println("Bonuses: " + employee1.bonuses());
		System.out.println("Pay Raise: " + employee1.payRaise());
	}

}
