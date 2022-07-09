
public class MathClass {

	public static void main(String[] args) {
		// Math.ceil(x) ---->>> rounding to integer up ^ 
		// Math.floor(x) ---->>> rounding to integer down
		// Math.cos(x) ----- Math.sin(x)
		// Math.max(x) ----- Math.min(x)
		// Math.pow(x) Power ----- Math.random(x) ------- Math.round(x) rounding closer
		
		System.out.println(Math.ceil(3.5)); // rounding to integer up
		System.out.println(Math.floor(3.5)); // rounding to integer down
		System.out.println(Math.sin(0)); // sin (0) = 0 
		System.out.println(Math.cos(0)); // cos (0) = 1
		
		System.out.println(Math.min(3,5));  // 3
		System.out.println(Math.max(3,5));  // 5
		
		System.out.println(Math.pow(2,3));  // 2*2*2 = 8
		System.out.println(Math.random());  // random
		System.out.println(Math.round(3.5));// 4
		
	}

}
