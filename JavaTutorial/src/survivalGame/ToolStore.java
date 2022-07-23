package survivalGame;

public class ToolStore extends NormalLocation{
	
	ToolStore(Player player) {
		super(player, "Store");
		
	}
	
	public boolean getLocation() {
		System.out.println("Your amount of money: " + player.getMoney());
		System.out.println("1 --> Weapons");
		System.out.println("2 --> Armors");
		System.out.println("3 --> Exit");
		System.out.print("Your choice: ");
		int selectTool = scan.nextInt();
		int selectItemID;
		switch (selectTool) {
		
		case 1:
			selectItemID = weaponMenu();
			buyWeapon(selectItemID);
			break;
		case 2:
			selectItemID = armorMenu();
			buyArmor(selectItemID);
			break;
		default:
			break;
		}

		return true;
	}
	
	
	public int armorMenu() {
		System.out.println("1 --> Light\t - Price: 15 - Defense: 1");
		System.out.println("2 --> Middle\t  - Price: 25 - Defense: 3");
		System.out.println("3 --> Heavy\t  - Price: 40 - Defense: 5");
		System.out.println("4 --> Exit");
		System.out.print("Your choice: ");
		
		int selectArmorID = scan.nextInt();
		return selectArmorID;
	}
	
	public void buyArmor(int itemID) {
		int defense = 0, price = 0;
		String armorName = null;
		switch(itemID) {
		case 1:
			defense = 1;
			armorName = "Light";
			price = 15;
			break;
		case 2:
			defense = 3;
			armorName = "Middle";
			price = 25;	
			break;
		case 3:
			defense = 5;
			armorName = "Heavy";
			price = 40;	
			break;
		case 4:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
		if(price >= 0) {
			player.getInventory().setArmor(defense);
			player.getInventory().setArmorName(armorName);
			player.setMoney(player.getMoney() - price);
			System.out.println("New armor bought - New Defense: " + player.getInventory().getArmor());
			System.out.println("New Amount: " + player.getMoney());
		}else {
			System.out.println("Insufficient Balance");
		}
	}
	
	
	
	public int weaponMenu() {
		System.out.println("1 --> Gun(Pistol)\t - Price: 25 - Damage: 2");
		System.out.println("2 --> Sword\t  - Price: 35 - Damage: 3");
		System.out.println("3 --> Rifle\t  - Price: 45 - Damage: 7");
		System.out.println("4 --> Exit");
		System.out.print("Your choice: ");
		
		int selectWeaponID = scan.nextInt();
		return selectWeaponID;
	}
	public void buyWeapon(int itemID) {
		int damage = 0, price = 0;
		String weaponName = null;
		switch(itemID) {
		case 1:
			damage = 2;
			weaponName = "Gun(Pistol)";
			price = 5;
			break;
		case 2:
			damage = 3;
			weaponName = "Sword";
			price = 35;	
			break;
		case 3:
			damage = 5;
			weaponName = "Rifle";
			price = 45;	
			break;
		case 4:
			System.out.println("Exiting...");
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
		if(price >= 0) {
			player.getInventory().setDamage(damage);
			player.getInventory().setWeaponName(weaponName);
			player.setMoney(player.getMoney() - price);
			System.out.println("New weapon bought - New Damage: " + player.getTotalDamage());
			System.out.println("New Amount: " + player.getMoney());
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}
}
