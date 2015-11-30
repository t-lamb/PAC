import java.util.Scanner;
import java.io.*;

public class GameofLife{
	public static final int M = 25; //rows
	public static final int N = 75; //columns

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		boolean quit = false;
		int genNum = 0;
		char[][] oldGen = new char[M + 2][N + 2];

		System.out.println("What file would you like to open?");
		//gets name of file
		String filename = in.next();
		//creates new file object
		File file = new File(filename);
		Scanner fileReader = null;
		try {
			//Scanner can read file
	    	fileReader = new Scanner (file);		
		} catch (Exception e) {
			//error handling
	    	System.out.print("file " + file + " does not exist");
	    	System.exit(0);
		}

		//create initial 2D array from file
		for (int row = 0; row < oldGen.length; row++) {
			if (row == 0 || row == (oldGen.length-1)){
				//add row of '.' at top and bottom
				for (int col = 0; col < oldGen[0].length; col++){
					oldGen[row][col] = '.';
				}
			} else { 
				//read lines from file, add '.' of padding on each side
				String line = "." + fileReader.nextLine() + ".";
				//save string as char array
				oldGen[row] = line.toCharArray();
			}
		}
		print(oldGen, genNum);

		while(!quit){
			System.out.println("Would you like to see another generation? (y/n)");
			String input = in.next();
			if (input.equalsIgnoreCase("n")){
				quit = true;
			} else {
				//update generation
				char[][] newGen = new char[M + 2][N + 2];				
				genNum++;
					
				for (int row = 0; row < newGen.length; row++){
					for (int col = 0; col < newGen[0].length; col++){
						if(row == 0 || row == (newGen.length-1)){
							//add padding rows on top and bottom
							newGen[row][col] = '.';
						} else if(col == 0 || col == (newGen[0].length-1)){
							//add padding columns on left and right
							newGen[row][col] = '.';
						} else {
							//check neighbors of each cell (not padding cells)
							int neighbors = getNeighbors(oldGen, row, col);
							//update new array
							if (oldGen[row][col] == 'X'){
								if (neighbors == 2 || neighbors == 3){
									newGen[row][col] = 'X';
								} else {
									newGen[row][col] = '.';
								}
							} else {
								if(neighbors == 3){
									newGen[row][col] = 'X';
								} else {
									newGen[row][col] = '.';
								}
							}
						}
					}
				}
				print(newGen, genNum);

				//update old generation with current values
				oldGen = newGen;

				//check if world is empty
				if (isEmpty(newGen)){
					System.out.println("Your world is empty.");
					quit = true;
				}
			}
		}
		System.out.println("Goodbye.\n");
	}

	public static int getNeighbors(char[][] world, int row, int col){
		/* 
		Take a world and the coordinates of a cell and 
		return the number of neighbors (organisms in neighboring cells)
		that the cell has.
		*/
		int count = 0;
		for (int i = - 1; i <= 1; i++){
			for (int j = -1; j <= 1; j++) {
				if(i == 0 && j == 0){
					count = count;
				} else if (world[row + i][col + j] == 'X'){
					count++;
				}
			}
		}
		return count;
	}

	public static boolean isEmpty(char[][] world){
		/*
		Take a generation array and return a Boolean value that 
		tells whether or not the world represented by the array is empty.
		*/
		for(int row = 0; row < world.length; row++){
			for (int col = 0; col < world[0].length; col++){
				if(world[row][col] == 'X'){
					return false;
				}
			}
		}
		return true;
	}

	public static void print(char[][] world, int genNum){
		
		System.out.println("\nGeneration " + genNum + ":");

		for (int row = 1; row <= M; row++) {
			for (int col = 1; col <= N; col++){
				System.out.print(world[row][col]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		// //iterate through every row in newGen
		// for (char cellArr[] : world){
		// 	//iterate through every cell in that row
		// 	for (char cell : cellArr){
		// 		//print every cell in that row
		// 		System.out.print(cell);
		// 	}
		// 	//at the end of every row, print new line
		// 	System.out.print("\n");
		// }
		// System.out.print("\n");
	}
} 