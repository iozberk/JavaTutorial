package survivalGame;

public class SafeHouse extends NormalLocation{

	SafeHouse(Player player) {
		super(player, "Safe House");
		
	}
	
	public boolean getLocation() {
		player.setHealth(player.getRealHealth());
		System.out.println("Health filled ");
		return true;
	}

}
