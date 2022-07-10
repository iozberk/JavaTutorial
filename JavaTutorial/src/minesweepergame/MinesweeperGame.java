package minesweepergame;

import java.util.Random;
import java.util.Scanner;

public class MinesweeperGame {

	int rowNumber, colNumber, size;
	int[][] map;
	int[][] board;
	boolean gameStatus = true;
	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	MinesweeperGame(int rowNumber, int colNumber){
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.size = rowNumber * colNumber;
		this.map = new int[rowNumber][colNumber];
		this.board = new int[rowNumber][colNumber];
		
	}
	public void run() {
		prepareGame();
		printMap(map);
		System.out.println("Game Started!!!");
		while(gameStatus) {
			int row, column, success = 0;
			printMap(board);
			System.out.print("Please enter row: ");
			row = input.nextInt();
			System.out.print("Please enter column: ");
			column = input.nextInt();
			if(map[row][column] != -1){
				checkMine(row,column);
				success++;
				if(success == (size - (size/4))) {
					System.out.println("Successful game - you made it");
					break;
				}
			}else {
				gameStatus = false;
				System.out.println("Game Over!");
			}
		}
	}
	
	
	public void checkMine(int r, int c) {
		if(map[r][c] == 0) {
			if((c < colNumber - 1) && (map[r][c + 1] == -1)) {
				 board[r][c]++;
			 }
			 if((r < rowNumber - 3) && (map[r + 1][c] == -1)) {
				 board[r][c]++;
			 }
			 if((r > 0) && (map[r - 1][c] == -1)) {
				 board[r][c]++;
			 }
			 if((c > 0) && (map[r][c - 1] == -1)) {
				 board[r][c]++;
			 }
		}
		if(board[r][c] == 0) {
			board[r][c] = -2; 
		}
		 
		 
	}
	
	public void prepareGame() {
		int randRow, randCol, count = 0;
		while(count != (size/4)) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if(map[randRow][randCol] != -1) {
			   map[randRow][randCol] = - 1;
			   count++;
			}
		}
	}
	public void printMap(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
