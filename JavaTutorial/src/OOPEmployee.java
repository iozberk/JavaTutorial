
public class OOPEmployee {
	public String name;
	public double salary, totalSalary;
	private int workHours, hireYear;
	
	
	OOPEmployee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(this.salary >= 2000) {
			return 2000 * 0.03;
		}		
		return 0.0;
	}
	public double bonuses() {
		return 50.0 * this.workHours;
	}
	
	public double payRaise() {
		int year = 2022 - this.hireYear;
		if(year < 10) {
			return salary * 1.05;
		} else if(year >= 10 && year < 20) {
			return salary * 1.10;
		} else {
			return salary * 1.15;
		}
	}
	public void toString(OOPEmployee employee1) {
		System.out.println("Name: " + employee1.name);
		System.out.println("Tax: " + employee1.tax());
		System.out.println("Bonuses: " + employee1.bonuses());
		System.out.println("Pay Raise: " + employee1.payRaise());
		double totalSalary = employee1.salary - employee1.tax() + employee1.payRaise();
		System.out.println("Total Salary: " + totalSalary);
	}
	
}
