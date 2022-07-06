
public class Methods {

	public static void main(String[] args) {
		// f(x) = 2x + 2
		greeting("James");
		greeting("Marry");
		greeting("Robert");
		greeting("Patricia");
		greeting("Jennifer");
		System.out.println("MSi Test");
	}
	
	static void greeting(String a) {
		String name = a;
		System.out.println("Hello " + name + "!");
	}


}
