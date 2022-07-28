import java.util.Scanner;
public class NumberGuessingGame2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 1 + (int) (100 * Math.random());
		int K = 5; // Given Trials
		int i, guess;
		System.out.println("Choose a number between 1 and 100. You have 5 trials.");
		System.out.println(number);
		for(i = 0; i < K; i++) {
			System.out.print("Guess the number: ");
			guess= input.nextInt();
			input.close();
			if(guess == number) {
				System.out.println("Congratulations! You guessed the number.");
	        	System.out.println("Guessed number is: " + number);
	        	break;
			}else if(number < guess && i != K - 1) {
				System.out.println("This number less than " + guess);
			}else if(number > guess && i != K - 1) {
				System.out.println("This number greater than " + guess);
			}
		}
		if(i == K) {
			System.out.println("You have exhausted K trials.");
	        System.out.println("The number was: " + number);
		}

	}

}
