
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
	public String toString() {
		System.out.println("Name: " + this.name);
		System.out.println("Tax: " + this.tax());
		System.out.println("Bonuses: " + this.bonuses());
		System.out.println("Pay Raise: " + this.payRaise());
		double totalSalary = this.salary - this.tax() + this.payRaise();
		System.out.println("Total Salary: " + totalSalary);
		return name;
	}
	
}
