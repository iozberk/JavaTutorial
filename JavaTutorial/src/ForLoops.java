
public class ForLoops {

	public static void main(String[] args) {
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		for(int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
		for(int i = 0; i <= 20; i = i + 3) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		for(int i = 5; i >= 0; i = i - 1) {
			System.out.println(i);
		}
		
		System.out.println("----------nested");
		
		for(int i = 0; i  <= 3; i = i + 1) {
			for (int j = 0; j <= 3; j++) {
				System.out.println("j: " + j);
				System.out.println("------");
			}
			System.out.println("i: " + i);
			System.out.println("------");
		}
		for (int i = 0; i  <= 3; i ++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println("i: "+ i + " j: " + j);
			}	
		}
		}
		
	}
	
