import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// Fibonacci Numbers 0, 1, 1, 2, 3, 5, 8, 13, 21 ...
		int num1 = 0, num2 = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int fib = input.nextInt();
		input.close();
		for(int i = 1; i <= fib; i++) {
			
			System.out.print(num1 + " , ");
			int total;
			total = num1 + num2;
			num1 = num2;
			num2 = total;
			
		}
	}

}
