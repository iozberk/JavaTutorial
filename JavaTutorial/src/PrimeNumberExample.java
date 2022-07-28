import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// Prime Number Calculator
		Scanner input = new Scanner(System.in);
		int prime;
		
		boolean	primee = true;
		do {
			System.out.println("Enter positive number: ");
			prime = input.nextInt();
			
		}while(prime < 2);
		
		for(int i = 2; i < prime; i++) {
			if(prime % i == 0) {
				primee = false;
				break;
			}
		}
		if(primee == true) {
			System.out.println("Entered number: " + prime + " is prime");
		}else {
			System.out.println("Entered number: " + prime + " NOT prime");
		}
		input.close();
	}

}
