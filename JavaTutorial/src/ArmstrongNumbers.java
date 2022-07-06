
public class ArmstrongNumbers {

	public static void main(String[] args) {
		// Example 371 --->>> (3*3*3) + (7*7*7) + (1*1*1)
		int temp, units, tens, hundreds, total;
		for(int i = 100; i <= 999; i++) {
			temp = i;
			
			units = temp % 10;
			temp /= 10;
			tens = temp % 10;
			temp /= 10;
			hundreds = temp % 10;
			temp /= 10;
			
			total = (units * units * units) + (tens * tens * tens) + (hundreds * hundreds * hundreds); 
			
			if(total == i) {
				System.out.println(i + " is Armstrong Number");
			}
		}
		
		
	}

}
