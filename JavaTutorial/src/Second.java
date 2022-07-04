
public class Second {

	public static void main(String[] args) {
		Main myObj = new Main();
		myObj.x = 40;
	    System.out.println("Second.java " + myObj.x);
	    Main myObj3 = new Main(); // Create an object of Main
	    myObj3.myPublicMethod();
	}

}
