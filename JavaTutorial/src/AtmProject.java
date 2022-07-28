import java.util.Scanner;

public class AtmProject {

	public static void main(String[] args) {
		int balance = 10000, input, amount = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to JavaBank !!!");
		System.out.println("Your Current Balance: " + balance);
		
		while(balance > 0) {
			System.out.println();
			System.out.println("1 - Deposit ");
			System.out.println("2 - Withdrawal ");
			System.out.println("3 - Inquiry ");
			System.out.println("4 - Exit ");
			System.out.println("Select Transaction: ");
			input = scan.nextInt();
			
			if(input == 1) {
				System.out.println("Please enter amount: ");
				amount = scan.nextInt();
				balance += amount;
				System.out.println("New Balance after deposit: " + balance);
			}else if(input == 2) {
				System.out.println("Please enter amount: ");
				if(amount > balance) {
					System.out.println("Insufficient Balance");
				}else {
				amount = scan.nextInt();
				balance -= amount;
				System.out.println("New Balance after Withdrawal: " + balance);
			}
			}else if(input == 3) {
				System.out.println("Balance: " + balance);
			}else {
				break;
			}
			
		}
		scan.close();
		System.out.println("Thanks!!!");		
		
	}

}
