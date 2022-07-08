
public class Main {
	int x = 5;
	int y = 3;
	
	static void myMethod() {
		System.out.println("Print function my Method");
	}
	
	public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }
	
	
	
	public static void main(String[] args) {
		Main myObj1= new Main(); // Object 1
		Main myObj2= new Main(); // Object 2
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
		myMethod();
		System.out.println("-------- OOP 1 --------");
		OOP oop = new OOP(1,1);
		oop.num1 = 2;
		oop.num2 = 5;
		
		System.out.println("OOP " + oop.num1);
		System.out.println("OOP " + oop.num2);
		
		System.out.println("addition " + oop.addition());
		System.out.println("subtraction " + oop.subtraction());
		System.out.println("division " + oop.division());
		System.out.println("multiplication " + oop.multiplication());
		
		System.out.println("-------- OOP 2 --------");
		
		OOP oop2 = new OOP(1,1);
		oop2.num1 = 15;
		oop2.num2 = 23;
		
		System.out.println("OOP " + oop2.num1);
		System.out.println("OOP " + oop2.num2);
		
		System.out.println("addition " + oop2.addition());
		System.out.println("subtraction " + oop2.subtraction());
		System.out.println("division " + oop2.division());
		System.out.println("multiplication " + oop2.multiplication());
	}
	
	
	

}
