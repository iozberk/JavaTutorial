
public class RecursiveFibonacci {

	// f(6) = f(5) + f(4) 
	// f(5) = f(4) + f(3) 
	// f(4) = f(3) + f(2) 
	// f(3) = f(2) + f(1) 

	static int fibrec(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
			return fibrec(n - 1) + fibrec(n - 2);
		}
	
	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21 ... 
		
		System.out.println(fibrec(8));

	}

}
