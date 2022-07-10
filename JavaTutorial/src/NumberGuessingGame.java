import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		 // Given K trials
        int K = 5; 
        int i, guess;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(10);
        boolean gameStatus = false;
        System.out.println("Welcome to Guess number Game");
        System.out.println("Guess the number 0 - 99");
        while(K > 0) {
        	System.out.println("Guess the number:");
        	guess = input.nextInt();
        	if((guess < 0) || (guess > 99)) {
        		System.out.println("Please enter the number 0 - 99");
        		continue;
        	}
        	if(guess == number) {
        		gameStatus = true;
        		break;
        	}else {
        		System.out.println("Wrong number please enter new number! Remaining trial:" + --K);
        	}
        }
        if (gameStatus) {
        	System.out.println("Congratulations! You guessed the number.");
        	System.out.println("Guessed number is: " + number);
        	System.out.println("Remaining trial: " + K);
		}else {
			System.out.println("You have exhausted K trials.");
	        System.out.println("The number was " + number);
		}
        
        
        
        
        
        
	}

}
