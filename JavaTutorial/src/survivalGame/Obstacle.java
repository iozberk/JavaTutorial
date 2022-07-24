package survivalGame;
import java.util.Random;

public class Obstacle {
	private String name;
	private int damage, award, health, maxNumberOfBeast;
	public Obstacle(String name, int damage, int health, int award, int maxNumberOfBeast) {
		super();
		this.name = name;
		this.damage = damage;
		this.award = award;
		this.health = health;
		this.maxNumberOfBeast = maxNumberOfBeast;
	}
	
	public int obstacleCount() {
		Random random = new Random();
		return random.nextInt(this.maxNumberOfBeast) + 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getAward() {
		return award;
	}
	public void setAward(int award) {
		this.award = award;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMaxNumberOfBeast() {
		return maxNumberOfBeast;
	}
	public void setMaxNumberOfBeast(int maxNumberOfBeast) {
		this.maxNumberOfBeast = maxNumberOfBeast;
	}
	
	
	
	
	
}
