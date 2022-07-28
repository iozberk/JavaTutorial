import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		while (true) {
			System.out.println("Enter number");
			number = input.nextInt();
			if (number == 0) {
				System.out.println("You enter 0");
				break;
			}else {
				for (int i = 1; i <= number; i++) {
					System.out.println(i +". hi");
				}
				break;
			}
			
			
		}
		input.close();
		System.out.println("----Java Continue----");
			for(int i = 0; i < 10; i++) {
				if(i == 3) {
					continue; // 0 1 2  4 5 6 7 8 9
				}
				System.out.println(i);
			}
	}

}
