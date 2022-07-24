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
    	System.out.println("Now your location is: "+ getName());
    	System.out.println("There are "+ obstacleCount + " " + obstacle.getName() +" here!!!");
    	System.out.println("Choose to <H>it or <R>un");
    	String selectCase = scan.next();
    	selectCase = selectCase.toUpperCase();
    	if(selectCase.equals("H")) {
    		if(combat(obstacleCount)) {
    			System.out.println("You killed them all!!!");
    			return true;
    		}else {
    			System.out.println("You died!!! Game Over!!!");
    			return false;
    		}
    		
    	}
    	return true;
	}
    
    public boolean combat(int obstacleCount) {
    	for(int i = 0; i < obstacleCount; i++) {
    		playerStats();
    		enemyStats();
    	}
    	return true;
    }
    
    public void playerStats() {
    	System.out.println("Player Details --->>  \t Health: \t "+ player.getHealth() +" \t Damage: \t "+ player.getTotalDamage()+" \t Defense: \t "+ player.getTotalDefense());
    	if(player.getInventory().getDamage() > 0) {
    		System.out.println("Weapon: " + player.getInventory().getWeaponName());
    	}
    	if(player.getInventory().getArmor() > 0) {
    		System.out.println("Armor: " + player.getInventory().getArmorName());
    	}
    }
    
    public void enemyStats() {
    	System.out.println("Enemy: " + obstacle.getName() + " Details: --->>  \t Health: \t " + obstacle.getHealth() + " \t Damage: \t " + obstacle.getDamage() + "\t Award: \t" + obstacle.getAward());
    }
    
    

}
