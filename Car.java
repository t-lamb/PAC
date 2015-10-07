/* 
Teresa Lamb
PAC I - Lab 4 - Due 10/7/15
Run 'Car'
*/

import java.util.Scanner;

public class Car {
	Scanner userInput = new Scanner(System.in);
	boolean ignition = false;
	char colorChar = colorAssign();
	String colorString = "";
	int carX = randomPosition();
	int carY = randomPosition();

	public static void main(String args[]){		
		
		Car car = new Car();
		car.reportStates();

	}

	public static int randomPosition() {
		int a = (int )(Math.random() * 20 + 1);
		return a;
	}

	public static char colorAssign() {	
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
			default: c = 'Z'; //undefined
					break;
		}
		return c;
	}

	public static int moveCarX() {
		return 0;
	}

	public static int moveCarY() {
		return 0;
	}

	public static void ignitionState() {

	}

	public void reportStates() {
		System.out.println("Car Information");

		//Print colorString based on Char
		switch(colorChar) {
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
		if (ignition) {
			System.out.println("Ignition: on");
		} else {
			System.out.println("Ignition: off");
		}

		//print car location
		System.out.println("Location: (" + carX + ", " + carY + ")");

		//print grid
		for (int i = 0; i < 20; i++) {

			if (i > 0) {
				System.out.print("\n");
			}
			System.out.print("- ");

			for (int j = 0; j < 20; j++){
				if (i == (carX - 1) && j == (carY - 1)){
					System.out.print("R ");
				} else {
					System.out.print("- ");
				}
			}
		}
		System.out.print("\n");
	}
}