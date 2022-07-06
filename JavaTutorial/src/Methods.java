
public class Methods {

	public static void main(String[] args) {
		// f(x) = 2x + 2
		greeting("James");
		greeting("Marry");
		greeting("Robert");
		greeting("Patricia");
		greeting("Jennifer");
		
		power(3, 2);
		power(2, 3);
	}
	
	static void greeting(String a) {
		String name = a;
		System.out.println("Hello " + name + "!");
	}
	static void power(int num1, int num2) {
		int result = 1;
		for(int i = 1; i <= num2; i++) {
			result *= num1;
		}
		System.out.println("Power: "+ result);
	}


}
