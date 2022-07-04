import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scan.nextInt();
		
		switch (number) {
		case 1:
			System.out.println("Number equal 1:");
			break;
		case 2:
			System.out.println("Number equal 2:");
			break;
		case 3:
			System.out.println("Number equal 3:");	
		default:
			System.out.println("Error");
		}
		
	}

}
