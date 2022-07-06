import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// Factorical
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for factorical: ");
		int factorical = input.nextInt();
		int result = 1;
		while(factorical > 0) {
			result *= factorical;
			factorical--;
			
		}
		System.out.println("Factorical Result: " + result);
	
		// Harmonic
			
		System.out.println("Enter a number for harmonic: ");
		double harmonic = input.nextInt();
		double harmonicResult = 0.0;
		while(harmonic > 0) {
			harmonicResult = harmonicResult + 1/harmonic;
			harmonic--;
		}
		System.out.println("Harmonic Result: " + harmonicResult);
	}

}
