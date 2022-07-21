package survivalGame;

public class Player {
	private int damage, health, money;
	private String name,charName;
	private Inventory inventory;
	
	public Player(String name) {
		// public Player(int damage, int health, int money, String name, String charName, Inventory inventory) {
		// super();
		// this.damage = damage;
		// this.health = health;
		// this.money = money;
		this.name = name;
		// this.charName = charName;
		// this.inventory = inventory;
	}
	
	
	
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	
	
	
}
