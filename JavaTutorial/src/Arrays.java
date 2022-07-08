import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		int[] list = new int[4]; // int[] list = {0,1,2,3,4,5};
		list[0] = 0;
		list[1] = 1;
		list[2] = 2;
		list[3] = 3;
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(i);
		}
		
		int[] list1 = new int[4];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < list1.length; i++) {
			System.out.println("Please enter " + i + " number");
			list1[i] = input.nextInt();
		}
		
		for(int i = 0; i < list1.length; i++) {
			System.out.println(i + " Number is " + list1[i]);
		}
		
	}

}
