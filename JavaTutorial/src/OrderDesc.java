import java.util.Scanner;

public class OrderDesc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		if (a > b && a > c) {
			if (b > c) {
				System.out.println("a > b > c");
			} else {
				System.out.println("a > c > b ");
			}
		} else if (b > a && b > c) {
			if (a > c) {
				System.out.println("b > a > c");
			} else {
				System.out.println("b > c > a ");
		}
			else {
				if (a > b) {
					System.out.println("c > a > b");
				}
				else {
					System.out.println("c > b > a");
				}
			}
	}
}
