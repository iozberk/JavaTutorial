
public class CarMain {
	
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
	
	public void speed(int MaxSpeed) {
		System.out.println("Max Speed is: " + MaxSpeed);
	}
	
		
	public static void main(String[] args) {
		CarMain myCar = new CarMain();
		myCar.fullThrottle();
		myCar.speed(180);
		
	}

}
