package survivalGame;

import java.util.Scanner;

public class Player {
	private int damage, health, money, realHealth;
	private String name,charName;
	private Inventory inventory;
	Scanner scan = new Scanner(System.in);
	
	public Player(String name) {
		// public Player(int damage, int health, int money, String name, String charName, Inventory inventory) {
		//super();
		// this.damage = damage;
		// this.health = health;
		// this.money = money;
		this.name = name;
		// this.charName = charName;
		this.inventory = new Inventory();
	}
	
	public void selectChar() {
		switch(selectMenu()) {
		case 1: // Knight
			initPlayer("Knight", 5, 21, 15);
			break;
		case 2: // Archer
			initPlayer("Archer", 7, 18, 20);
			break;
		case 3: // Warrior
			initPlayer("Warrior", 8, 24, 5);
			break;
		default:
			initPlayer("Knight", 5, 21, 15);
			break;
		}
		System.out.println("Chracter Created ---> Char Name: " + getCharName() + ", Damage: " + getDamage()+ ", Health: " + getHealth() + ", Money: "+ getMoney());
	}	
		
	
	public int selectMenu() {
		System.out.println();
		System.out.println("1 - Knight \t Damage = 5, Health = 21, Money = 15" );
		System.out.println("2 - Archer \t Damage = 7, Health = 18, Money = 20" );
		System.out.println("3 - Warrior \t Damage = 8, Health = 24, Money = 5" );
		System.out.println();
		System.out.print("Please enter your character choice: ");
		int charId = scan.nextInt();
		while (charId < 1 || charId > 3) {
			System.out.print("Please enter your character choice: ");
			charId = scan.nextInt();
		}
		return charId;
	}
	
	public int getTotalDamage() {
		return this.getDamage() + this.getInventory().getDamage(); 
				
	}
	
	public int getTotalDefense() {
		return this.getInventory().getDamage(); 
				
	}
	
	public void initPlayer(String charName, int damage, int health, int money) {
		setCharName(charName);
		setDamage(damage);
		setHealth(health);
		setMoney( money);
		setRealHealth(health);
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

	public int getRealHealth() {
		return realHealth;
	}

	public void setRealHealth(int realHealth) {
		this.realHealth = realHealth;
	}
	
	
	
	
}
