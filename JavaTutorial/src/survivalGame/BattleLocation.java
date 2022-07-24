package survivalGame;

public abstract class BattleLocation extends Location{

	protected Obstacle obstacle;

	BattleLocation(Player player, String name, Obstacle obstacle) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
	}
	
    public boolean getLocation() {
    	int obstacleCount = obstacle.obstacleCount();
    	
		return true;
	}
    

}
