
public class MultidimensionalArray {

	public static void main(String[] args) {
		
		int[][] table = new int[][] {
			{1,2,3},
			{10,20,30},
			{100,200,300}, 
			};
		// int[][] table2 = new int[5][3];
		table[0][0] = 1;
		table[0][1] = 2;
		table[0][2] = 3;
		table[1][0] = 10;
		table[1][1] = 20;
		table[1][2] = 30;
		table[2][0] = 100;
		table[2][1] = 200;
		table[2][2] = 300;
	
	for(int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
}


}
