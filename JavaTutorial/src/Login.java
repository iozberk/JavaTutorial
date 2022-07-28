import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		/* Scanner input = new Scanner(System.in);
        String username = "intecon", password = "magellan";
		System.out.println("Please enter username: ");
		String username1 = input.next();
		System.out.println("Please enter password: ");
		String password1 = input.next();
		
		if (username == username1 || password == password1) {
			System.out.println("Login successful!");
		}
		else {
			System.out.println("Login failed!");
		}
		*/
		Scanner input = new Scanner(System.in);
		String username, password;
		System.out.println("Please enter username: ");
		username = input.next();
		System.out.println("Please enter password: ");
		password = input.next();
		
		if (username.equals("intecon") && (password.equals("magellan"))) {
			System.out.println("Login successful!");
		}
		else {
			System.out.println("Login failed!");
		}
		input.close();
		
	} 

}
