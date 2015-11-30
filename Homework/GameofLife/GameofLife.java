import java.util.Scanner;
import java.io.*;

public class GameofLife{
	public static void main(String args[]){
		boolean quit = false;
		Scanner in = new Scanner(System.in);
		final int M = 25; //rows
		final int N = 75; //columns
		char[][] newGen = new char[M + 2][N + 2];
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

		for (int r = 0; r < newGen.length; r++) {
			if (r == 0 || r == (newGen.length-1)){
				for (int c = 0; c < newGen[0].length; c++){
					newGen[r][c] = '.';
				}
			} else { 
				String line = "." + fileReader.nextLine() + ".";
				newGen[r] = line.toCharArray();
			}
				
			System.out.println(newGen[r]);
		}

		while(!quit){
			System.out.println("Would you like to see another generation? (y/n)");
			String input = in.next();
			if (input.equalsIgnoreCase("n")){
				quit = true;
			} else {
				//newGen = oldGen
				//for each
					//check neighbors
					//set newGen
				//print new 2d array
			}

			// for(int m = 0; m < M; m++){
			// 	for (int n = 0; n < N; n++){
			// 		if(/*idk*/.equals("X")){
			// 			newGen[m][n] = 'X';
			// 		} else {
			// 			newGen[m][n] = '.';
			// 		}
                    
			// 	}
			// }

			//quit = isEmpty(newGen);
		}
	}


	//public static void 

	public static int getNeighbors(String world, int row, int col){
		/* 
		Take a world and the coordinates of a cell and 
		return the number of neighbors (organisms in neighboring cells)
		that the cell has.
		*/
		return 2;
	}

	public static boolean isEmpty(char gen[][]){
		/*
		Take a generation array and return a Boolean value that 
		tells whether or not the world represented by the array is empty.
		*/
		for(int row = 0; row < gen.length; row++){
			for (int col = 0; col < gen[0].length; col++){
				if(gen[row][col] == 'X'){
					return false;
				}
			}
		}
		return true;
	}
} 