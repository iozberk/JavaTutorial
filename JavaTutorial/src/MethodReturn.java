
public class MethodReturn {

	static int power(int num1, int num2) {
		int result = 1;
		for(int i = 1; i <= num2; i++) {
			result *= num2;
		}
		// System.out.println("Result: " + result); 
		return result;
	}
	
	
	public static void main(String[] args) {
		int num3 = power(2,3);
		System.out.println(num3);
	}
	
	

}
