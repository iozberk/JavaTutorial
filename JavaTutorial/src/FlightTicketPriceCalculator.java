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
		System.out.println("Please enter flight kilometer: ");
		kilometer = input.nextInt();
		System.out.println("Please enter your age: ");
		age = input.nextInt();
		
		System.out.println("Please enter flight type: (1- OneWay\n 2-RoundTrip)");
		flighttype = input.nextInt();
		
		double price, agediscount, flighttypediscount;
		
		if (kilometer > 0 && age > 0 && (flighttype == 1 || flighttype == 2)) {
			price = kilometer * kilometerprice;
			if (age < 12) {
				agediscount = price * 0.5;
				price -= agediscount;
			}
			else if (age >= 12 && age <= 24) {
				agediscount = price * 0.1;
				price -= agediscount;
			}
			else if (age >= 65) {
				agediscount = price * 0.3;
				price -= agediscount;
			}
			else {
				agediscount = 0;
			}
			if (flighttype == 2) {
				flighttypediscount = price * 0.2;
				price -= (price * flighttypediscount) * 0.2;				
			}
			System.out.println("Ticket Price: " + "$"+ price);
		}
		else {
			System.out.println("Incorrect information ");
		}
		
	}

}
