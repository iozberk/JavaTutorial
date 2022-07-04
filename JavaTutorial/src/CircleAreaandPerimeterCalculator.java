import java.util.Scanner;
public class CircleAreaandPerimeterCalculator {

	public static void main(String[] args) {
		// area = pi*r*r || perimeter = 2*pi*r 
		final double pi = 3.14; 
		double area, perimeter;
		double radius;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle ");
		
		radius = input.nextFloat();
		
		area = pi * radius * radius;
		perimeter = 2 * pi * radius;
		
		System.out.println("Circle area: " + area);
		System.out.println("Circle perimeter: " + perimeter);

	
		
	}

}
