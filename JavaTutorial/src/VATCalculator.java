import java.util.Scanner;

public class VATCalculator {

	public static void main(String[] args) {

		double amount, vat, vatrate = 0.18;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Amount: ");
		amount = input.nextInt();
		input.close();
		vat = amount * vatrate;
		amount += vat; 
		System.out.println("Price with VAT " + amount);

		
	}

}
