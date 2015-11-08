/* 
Teresa Lamb
PAC I - Lab 7 - Due 11/11/15
Run 'Car3'

*/

import java.util.Scanner;

public class Car3 {

	public static void main(String args[]){	
		Scanner userInput = new Scanner(System.in);	
		Car[] carArray = new Car[10];
		boolean quit = false;

		while (!quit) {
			System.out.println("Which car would you like to use next? (1-10)");
			int carInt = userInput.nextInt();
			int carPos = carInt - 1;

			System.out.println("What would you like to do with car " + carInt + "?");
			System.out.println("1: change ignition");
			System.out.println("2: change the position of car");
			System.out.println("3: quit this program");
			int input = userInput.nextInt();

			switch(input) {
				case 1: carArr[carPos].changeIgnition();
						break;
				case 2: movingCar = true;
						break;
				case 3: quit = true;
						break;
				default: System.out.println("Error: Invalid Direction");
						break;
			}

			if (movingCar) {
				System.out.println("In which direction would you like to move the car " + carInt + "?");
				System.out.println("1: horizontal");
				System.out.println("2: vertical");
				input = userInput.nextInt();

				switch(input) {
					case 1: 
						System.out.println("How far left (negative value) or right (positive value) would you like to move?");
						int moveX = userInput.nextInt();
						carArray[carPos].moveCarX(moveX);
						break;
					case 2:
						System.out.println("How far down (negative value) or up (positive value) would you like to move?");
						int moveY = userInput.nextInt();
						carArray[carPos].moveCarY(moveY);
						break;
					default: 
						System.out.println("Error: Invalid Direction");
						break;
				}
				movingCar = false;
			}

			reportStates(colorCharArray[carPos], ignitionArray[carPos], carXArray[carPos], carYArray[carPos]);
		}

	}





	static void reportStates(char inColorChar, boolean inIgnition, int inCarX, int inCarY) {
		System.out.println("Car Information");
		String colorString;

		//Print colorString based on Char
		switch(inColorChar) {
			case'R': colorString = "red";
					break;
			case'G': colorString = "green";
					break;
			case'B': colorString = "blue";
					break;
			case'W': colorString = "white";
					break;
			case'S': colorString = "silver";
					break;
			default: colorString = "Invalid color";
					break;
		}
		System.out.println("Color: " + colorString);

		//print ignition state
		if (inIgnition) {
			System.out.println("Ignition: on");
		} else {
			System.out.println("Ignition: off");
		}

		//print car location
		System.out.println("Location: (" + inCarX + ", " + inCarY + ")");

		//print grid
		for (int i = 0; i < 20; i++) {

			if (i > 0) {
				System.out.print("\n");
			}
			System.out.print("- ");

			for (int j = 0; j < 20; j++){
				if (j == (inCarX - 1) && i == (inCarY - 1)){
					System.out.print(inColorChar + " ");
				} else {
					System.out.print("- ");
				}
			}
		}
		System.out.print("\n");
	}
}