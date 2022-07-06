
/*

Recursive

f(1) = 1
f(2) = f(1) + 1
f(3) = f(2) + 2
f(4) = f(3) + 3

f(n) = f(n - 1) + n 


*/


public class RecursiveMethods {
	
	static int recursive(int x) {
		if (x == 1) {
			return 1;
		}
		return x + recursive(x - 1);
	}
	
	
	public static void main(String[] args) {
		// Recursive 
		System.out.println(recursive(10));
	}

}
