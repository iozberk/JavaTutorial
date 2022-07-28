import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
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
		
		System.out.println("*********************************");
		// Stars
		Scanner input2 = new Scanner(System.in);
		int star = input2.nextInt();
		int i = 1;
		while(i <= star) {
			int k = 1;
			while(k <= i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		*/
		
		// Exponent Calculator
		Scanner input3 = new Scanner(System.in);
		int num1, num2, result = 1;
		System.out.println("Enter base number: ");
		num1 = input3.nextInt();
		System.out.println("Enter exponent number: ");
		num2 = input3.nextInt();
		input3.close();
		int i = 1;
		while(i <= num2) {
			result = result * num1;
			i++;
		}
		System.out.println("Result: " + result);
	}

}
