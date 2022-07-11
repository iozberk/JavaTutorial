package OopAccessModifiers;

public class Car {
	private int enginePower, modelYear;
	public int speed; 
	protected String color;
	
	
	Car(){
		this.modelYear = 2022;
		this.enginePower = 200;
		this.speed = 100;
		this.color = "Red";
	}
	private void print() {
		System.out.println(modelYear);
		System.out.println(enginePower);
		System.out.println(speed);
		System.out.println(color);
	}
	protected void run() {
		print();
	}
}
