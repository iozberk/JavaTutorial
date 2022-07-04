import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter first number: ");
		num1 = input.nextInt();
		System.out.println("Please enter second number: ");
		num2 = input.nextInt();
		
		System.out.println("Please select: ");
		System.out.println("1- Addition\n2- Subtraction\n3- Division\n4- Multiplication");
		System.out.println("Selection : ");
		int select = input.nextInt();
		if (select == 1) {
			System.out.println("Addition: " + num1 + num2);
		}
		else if (select == 2) {
			System.out.println("Subtraction: " + (num1 - num2));
		}
		else if (select == 3) {
			if (num2 == 0) {
				System.out.println("Undefined");
			}
			else {
				System.out.println("Division: " + (num1 / num2));
			}
		}
		else {
			System.out.println("Multiplication: " + (num1 * num2));
		}
		
	}

}
