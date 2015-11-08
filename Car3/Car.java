/* 
Teresa Lamb
PAC I - Lab 7 - Due 11/11/15
Run 'Car'

*/

public class Car {
	private char colorChar;
	private boolean ignition;
	private int carX;
	private int carY;

	public Car () {
		colorAssign();
		ignition = false;
		carX = randomPosition();
		carY = randomPosition();
	}

	//COLOR METHODS
	public void colorAssign() {
		//set car color to a random color	
		char[] charArr = {'R', 'G', 'B', 'W', 'S'};
		int charArrIndex = (int )(Math.random() * 5);

		colorChar = charArr[charArrIndex];
	}

	public String getColor(){
		//return color string based on color char
		switch(colorChar) {
			case'R': return "red";
					//break;
			case'G': return "green";
					//break;
			case'B': return "blue";
					//break;
			case'W': return "white";
					//break;
			case'S': return "silver";
					//break;
			default: return "Invalid color";
					//break;
		}
	}

	//IGNITION METHODS
	public void changeIgnition() {
		//return the opposite ignition state
		ignition = !ignition;
	}

	public boolean getIgnition() {
		return ignition;
	}

	//POSITION METHODS
	public int randomPosition() {
		return (int)(Math.random() * 20 + 1);
	}

	public void moveCarX(int inMoveX) {
		if (ignition) {
			if (1 <= (inMoveX + carX) && (inMoveX + carX) <= 20) {
				carX = inMoveX;
			} else { //if car is outside of grid
				System.out.println("You cannot move the car out of the grid.");
			}
		} else { //if ignition is off
			System.out.println("You must turn on the ignition.");
		}
	}

	public void moveCarY(int inMoveY) {
		if (ignition) {
			if (1 <= (inMoveY + carY) && (inMoveY + carY) <= 20) {
				carY = inMoveY;
			} else { //if car is outside of grid
				System.out.println("You cannot move the car out of the grid.");
			}
		} else { //if ignition is off
			System.out.println("You must turn on the ignition.");
		}
	}

	public int getCarX() {
		return carX;
	}

	public int getCarY() {
		return carY;
	}

	//PRINT STATES
	public String toString() {
		String state = "Car Stats: ";

		state += ("\nColor: " + getColor());
		
		if(getIgnition()) {
			state += "\nIgnition: On";
		} else {
			state += "\nIgnition: Off";
		}
		
		state += ("\nLocation: " + getCarX() + ", " + getCarY() + "\n");

		//print grid
		for (int i = 0; i < 20; i++) {

			if (i > 0) {
				state += "\n";
			}
			state += "- ";

			for (int j = 0; j < 20; j++){
				if (j == (carX - 1) && i == (carY - 1)){
					state += (colorChar + " ");
				} else {
					state += "- ";
				}
			}
		}
		state += "\n";

		return state;
	}

}