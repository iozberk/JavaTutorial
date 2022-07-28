import java.util.Scanner;

public class GpaArray {

	public static void main(String[] args) {
		
		int[] grades = new int[7];
		// double result = 0.0;
		int total = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome! Please enter grades ordered: ");
	
		System.out.print("1 - Math: ");
		grades[0] = input.nextInt();

		System.out.print("2 - English: ");
		grades[1] = input.nextInt();
		
		System.out.print("3 - Physics: ");
		grades[2] = input.nextInt();
		
		System.out.print("4 - Chemistry: ");
		grades[3] = input.nextInt();

		System.out.print("5 - History: ");
		grades[4] = input.nextInt();

		System.out.print("6 - Music: ");
		grades[5] = input.nextInt();

		System.out.print("7 - Art: ");
		grades[6] = input.nextInt();
		input.close();
		for (int grade: grades) {
			total += grade;
			}
		System.out.print("Your Grade: " + (total/grades.length));
		}
	}

