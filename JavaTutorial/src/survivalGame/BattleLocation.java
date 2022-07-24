package survivalGame;

public abstract class BattleLocation extends Location{

	protected Obstacle obstacle;
	protected String award;
	BattleLocation(Player player, String name, Obstacle obstacle, String award) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
		this.award = award;
	}
	
    public boolean getLocation() {
    	int obstacleCount = obstacle.obstacleCount();
    	System.out.println("Now your location is: "+ getName());
    	System.out.println("There are "+ obstacleCount + " " + obstacle.getName() +" here!!!");
    	System.out.print("Choose to <H>it or <R>un: ");
    	String selectCase = scan.nextLine();
    	selectCase = selectCase.toUpperCase();
    	if(selectCase.equals("H")) {
    		if(combat(obstacleCount)) {
    			if(this.award.equals("Food") && player.getInventory().isFood() == false) {
    				System.out.println("You won: " + this.award);
    				player.getInventory().setFood(true);
    			}else if(this.award.equals("Water") && player.getInventory().isWater() == false) {
    				System.out.println("You won: " + this.award);
    				player.getInventory().setWater(true);
    			}else if(this.award.equals("FireWood") && player.getInventory().isFirewood() == false) {
    				System.out.println("You won: " + this.award);
    				player.getInventory().setFirewood(true);
    			}
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
    		int defaultObstacleHealth = obstacle.getHealth();
    		playerStats();
    		enemyStats();
    		while(player.getHealth() > 0 && obstacle.getHealth() > 0) {
    			System.out.print("<H>it or <R>un: ");
    			String selectCase = scan.nextLine();
    			selectCase = selectCase.toUpperCase();
    			if(selectCase.equals("H")) {
    				System.out.println("You hit the enemy!");
    				obstacle.setHealth(obstacle.getHealth() - player.getDamage());
    				afterHit();
    				if(obstacle.getHealth() > 0) {
    					System.out.println();
        				System.out.println("Enemy hit you ");
        				player.setHealth(player.getHealth() - (obstacle.getDamage() - player.getInventory().getArmor()));
        				afterHit();
    	    		}
    			}
    			if(player.getHealth() <= 0){
    				System.out.println("You died!");
    				return false;
    			}
    			return true;
    		}
    		if(obstacle.getHealth() <= 0 && player.getHealth() > 0) {
    			System.out.println("You killed enemy");
    			player.setMoney(player.getMoney() + obstacle.getAward());
    			System.out.println("Your current money: " + player.getMoney());
    			obstacle.setHealth(defaultObstacleHealth);
    		}else {
    			return false;
    		}
    		System.out.println("-------------------------------------------");
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
    public void afterHit() {
    	System.out.println("Player Health: " + player.getHealth());
		System.out.println(obstacle.getName() + " Health: " + obstacle.getHealth());
		System.out.println();
	}
    

}
