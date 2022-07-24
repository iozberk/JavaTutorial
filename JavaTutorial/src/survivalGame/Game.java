package survivalGame;
import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Survival Game");
		System.out.println("Please enter your name: ");
		// String playerName = scan.nextLine();
		//System.out.println("Welcome to game: " + playerName);
		player = new Player("PlayerName");
		player.selectChar();
		start();

	}
	
	public void start() {
		while (true) {
			System.out.println();
			System.out.println("////////////////////////////////////////");
			System.out.println();
			System.out.println("Please choice Location :");
			System.out.println("1 --> Safe House ");
			System.out.println("2 --> Cave ");
			System.out.println("3 --> Forest ");
			System.out.println("4 --> River ");
			System.out.println("5 --> Store ");
			System.out.println("Preferred Location :");
			int selectLocation = scan.nextInt();
			while(selectLocation < 0 || selectLocation > 5){
				System.out.println("Please choice Location :");
				selectLocation = scan.nextInt();
			}
			switch (selectLocation) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
				break;
			}
			if(location.getClass().getName().equals("Safe House")) {
				if(player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()) {
					System.out.println( " Congratulations you won the game..!!! ");
					break;
				}
			}     
			if (!location.getLocation()) {
				System.out.println("Game Over !!!");
				break;
			}
		}
	}
	
	
}
