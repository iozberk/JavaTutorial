
public class Foreach {

	public static void main(String[] args) {
		int[] list = new int[4]; // int[] list = {0,1,2,3,4,5};
		list[0] = 0;
		list[1] = 1;
		list[2] = 2;
		list[3] = 3;
		
		// Foreach use
		for (int value : list) {
			System.out.println(value);
		}
		
		System.out.println("---------------");
		int[][] table = new int[][] {
			{1,2,3},
			{10,20,30},
			{100,200,300}, 
			};
			
			for(int[] row : table) {
				for(int value: row) {
					System.out.print(value + " ");
				}
			}

	}

}
