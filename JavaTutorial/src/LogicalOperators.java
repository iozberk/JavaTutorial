
public class LogicalOperators {

	public static void main(String[] args) {
		int a = 10, b = 23 ;
		
		boolean condition1 = a < b;
		boolean condition2 = a > b;
		boolean condition3 = a == b;
		boolean condition4 = a != b;
		boolean condition5 = a <= b;
		boolean condition6 = (condition1 && condition2);
		boolean condition7 = (condition2 || condition3);
		
		System.out.println(condition1);
		System.out.println(condition2);
		System.out.println(condition3);
		System.out.println(condition4);
		System.out.println(condition5);
		System.out.println(condition6);
		System.out.println(condition7);
		
		
		
	}

}
