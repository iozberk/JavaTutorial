package survivalGame;
import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	
	
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Survival Game");
		System.out.print("Please enter your name: ");
		String playerName = scan.nextLine();
		System.out.println("Welcome to game: " + playerName);
		player = new Player(playerName);
		player.selectChar();

	}
	
	
	
}
