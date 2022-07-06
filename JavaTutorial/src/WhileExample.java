import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int factorical = input.nextInt();
		int result = 1;
		while(factorical > 0) {
			result *= factorical;
			factorical--;
			
		}
		System.out.println("Result: " + result);
	
	}

}
