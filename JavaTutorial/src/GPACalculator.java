import java.util.Scanner;

public class GPACalculator {

	public static void main(String[] args) {
		int midterm1, midterm2, finalgrade;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter MidTerm 1: ");
		midterm1 = input.nextInt();
		System.out.println("Please enter MidTerm 2: ");
		midterm2 = input.nextInt();
		System.out.println("Please enter Final Grade: ");
		finalgrade = input.nextInt();
		
		int lastgrade = (int) ((midterm1 * 0.3) + (midterm2 * 0.3) + (finalgrade * 0.5)); 
		System.out.println("Your Midterm and Final Average: "+ lastgrade);
		String conc = (lastgrade >= 50) ? "Passed" : "Not Passed";
		System.out.println(conc);
	}

}
