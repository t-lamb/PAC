/* 
Teresa Lamb
PAC I - Lab 4 - Due 10/7/15
Run 'Car'
*/

import java.util.Scanner;

public class Car {

	public static void main(String args[]){	
		Scanner userInput = new Scanner(System.in);			
		boolean ignition = false;
		char colorChar = colorAssign();
		String colorString = "";
		String input = "";
		int carX = randomPosition();
		int carY = randomPosition();
		int moveX = 0;
		int moveY = 0;
		boolean running = true;
		boolean movingCar = false;

		while (running) {
			reportStates(colorChar, ignition, carX, carY);
			System.out.println("What would you like to do?");
			System.out.println("1: turn the ignition on/off");
			System.out.println("2: change the position of car");
			System.out.println("Q: quit this program");
			input = userInput.next();

			switch(input) {
				case "1": ignition = ignitionRemix(ignition);
						break;
				case "2": movingCar = true;
						break;
				case "Q": running = false;
						break;
				default: System.out.println("Error: Invalid Direction");
						break;
			}

			if (movingCar) {
				System.out.println("In which direction would you like to move the car?");
				System.out.println("H: horizontal");
				System.out.println("V: vertical");
				String inputMove = userInput.next();

				if (inputMove.equals("H")) {
					System.out.println("How far left (negative value) or right (positive value) would you like to move?");
					moveX = userInput.nextInt();
					carX = moveCarX(ignition, carX, moveX);

				} else if (inputMove.equals("V")) {
					System.out.println("How far down (negative value) or up (positive value) would you like to move?");
					moveY  = userInput.nextInt();
					carY = moveCarY(ignition, carY, moveY);
				} else {
					System.out.println("Error: Invalid Direction");
				}
				movingCar = false;
			}
		}

	}

	static int randomPosition() {
		int a = (int )(Math.random() * 20 + 1);
		return a;
	}

	static char colorAssign() {	
		int b = (int )(Math.random() * 5 + 1);
		char c;

		switch(b) {
			case 1: c = 'R'; //red
					break;
			case 2: c = 'G'; //green
					break;
			case 3: c = 'B'; //blue
					break;
			case 4: c = 'W'; //white
					break;
			case 5: c = 'S'; //silver
					break;
			default: c = 'U'; //undefined
					break;
		}
		return c;
	}

	static int moveCarX(boolean inIgnition, int inCarX, int inMoveX) {
		if (inIgnition){
			if ((inMoveX + inCarX) <= 20){
				inCarX = inMoveX + inCarX;
			} else {
				System.out.println("You cannot move the car out of the grid.");
			}
		} else {
			System.out.println("You must turn on the ignition.");
		}
		return inCarX;
	}

	static int moveCarY(boolean inIgnition, int inCarY, int inMoveY) {
		if (inIgnition){
			if ((inMoveY + inCarY) <= 20) {
				inCarY = inMoveY + inCarY;
			} else {
				System.out.println("You cannot move the car out of the grid.");
			}	
		} else {
			System.out.println("You must turn on the ignition.");
		}
		return inCarY;
	}

	static boolean ignitionRemix(boolean inIgnition) {
		//return the opposite ignition state
		inIgnition = !inIgnition;
		return inIgnition;
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