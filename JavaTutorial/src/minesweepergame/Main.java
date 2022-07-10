package minesweepergame;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row, column;
		System.out.println("Welcome to Minesweeper Game");
		System.out.println("Please enter Minesweeper Game dimensions");
		System.out.print("Please enter row: ");
		row = input.nextInt();
		System.out.print("Please enter column: ");
		column = input.nextInt();
		MinesweeperGame minesweeper = new MinesweeperGame(row,column);
		minesweeper.run();
	}	

}
