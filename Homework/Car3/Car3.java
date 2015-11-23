/* 
Teresa Lamb
PAC I - Lab 7 - Due 11/11/15
Run 'Car3'

Start with an array of 10 car objects of random colors in random positions. 
Turn the cars on to move them around a 20x20 grid. 
*/

import java.util.Scanner;

public class Car3 {

	public static void main(String args[]) {	
		Scanner userInput = new Scanner(System.in);	
		Car[] carArray = new Car[10];
		boolean movingCar = false;
		boolean quit = false;

		for (int i=0; i < carArray.length; i++) {
			carArray[i] = new Car();
		}

		while (!quit) {
			System.out.println("Which car would you like to use next? (1-10)");
			int carInt = userInput.nextInt();
			if (1 <= carInt && carInt <= carArray.length) { //checks to make sure input is valid car number
				int carPos = carInt - 1;
				System.out.println(carArray[carPos].toString());

				System.out.println("What would you like to do with car " + carInt + "?");
				System.out.println("1: change ignition");
				System.out.println("2: change the position of car");
				System.out.println("3: quit this program");
				int input = userInput.nextInt();

				switch(input) {
					case 1: carArray[carPos].changeIgnition();
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
					int moveX = 0;
					int moveY = 0;

					switch(input) {
						case 1: 
							System.out.println("How far left (negative value) or right (positive value) would you like to move?");
							moveX = userInput.nextInt();
							carArray[carPos].moveCarX(moveX);
							break;
						case 2:
							System.out.println("How far down (negative value) or up (positive value) would you like to move?");
							moveY = userInput.nextInt();
							carArray[carPos].moveCarY(moveY);
							break;
						default: 
							System.out.println("Error: Invalid Direction");
							break;
					}
					movingCar = false;
				}

				System.out.println(carArray[carPos].toString());

			} else {
				System.out.println("Error: There is no car with that number.");
			}
		}
	}
}