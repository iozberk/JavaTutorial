import java.util.Scanner;

public class FlightTicketPriceCalculator {

	public static void main(String[] args) {
		// price per kilometer -->> 0.10$
		// 12 years younger %50 discount
		// 12 - 24 %10 discount
		// 65 or older %30 discount
		// Round trip %20 discount
		
		Scanner input = new Scanner(System.in);
		int age, kilometer, flighttype;
		double kilometerprice = 0.1;
		System.out.println("Please enter your age: ");
		age = input.nextInt();
		System.out.println("Please enter flight kilometer: ");
		kilometer = input.nextInt();
		System.out.println("Please enter flight type: (1- OneWay\n 2-RoundTrip)");
		flighttype = input.nextInt();
		if (kilometer > 0 && age > 0 && (flighttype == 1 || flighttype == 2)) {
			System.out.println("Correct information ");
		}
		else {
			System.out.println("Incorrect information ");
		}
		
		double price;
		
		if (age <= 12) {
			price = ((kilometer * kilometerprice) * 0.5);
			System.out.println("Your Ticket Price: " + price);
		}
		else if (age >= 13 && age <= 24) {
			price = ((kilometer * kilometerprice) * 0.9);
			System.out.println("Your Ticket Price: " + price);
		}
		else if (age >= 65) {
			price = ((kilometer * kilometerprice) * 0.7);
			System.out.println("Your Ticket Price: " + price);
		}
	}

}
