
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
	}
	

}
