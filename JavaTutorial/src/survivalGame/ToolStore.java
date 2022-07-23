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
			
			break;
		default:
			break;
		}

		return true;
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
		default:
			System.out.println("Invalid Selection");
			break;
		}
		if(player.getMoney() > price) {
			player.getInventory().setDamage(damage);
			player.getInventory().setWeaponName(weaponName);
			player.setMoney(player.getMoney() - price);
			System.out.println("New weapon bought - New Damage: " + player.getDamage()+player.getInventory().getDamage() );
			System.out.println("New Amount: " + player.getMoney());
		}else {
			System.out.println("Insufficient Balance");
		}
		
	}
}
