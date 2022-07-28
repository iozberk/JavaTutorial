import java.util.Scanner;

public class ConsoleDataEnter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("A Sayisini Giriniz: " );
		a = input.nextInt();
		System.out.println("B Sayisini Giriniz: " );
		b = input.nextInt();
		input.close();
		System.out.println("A + B = "+ (a + b));
		System.out.println("A - B = "+ (a - b));
	}

}
