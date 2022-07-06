
public class Overloading {

	
	static int add(int a, int b) {
		return a + b;		
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;		
	}
	
	static double add(int a, int b, int c, double d) {
		return a + b + c + d;		
	}
	
	public static void main(String[] args) {
		// Overloading 
		
		System.out.println("1. " + add(2,3));
		System.out.println("2. " + add(2,3,3));
		System.out.println("3. " + add(2,3,3,3.0));
	}

}
