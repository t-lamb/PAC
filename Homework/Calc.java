/* 
Teresa Lamb
PAC I - Lab 3 - Due 9/30/15
Run 'Calc'
*/

import java.util.Scanner;

public class Calc {
	public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);
	String input0, input1;
	String op = "";
	double num0 = 0.0;
	double num1 = 0.0;
	double answer = 0.0;
	boolean firsttime = true;
	boolean dividebyzero = false;
	boolean unknownoperator = false;
	boolean quit = true;

		while (quit) {
			
			if (firsttime) {
				System.out.println("type c to clear. \'type x to exit");
				System.out.print("1st input: ");
				input0 = userInput.next();
				num0 = Double.parseDouble(input0);
				firsttime = false;
			}

			System.out.print("op: ");
			op = userInput.next();

			if (op.equals("x")) {
				quit = false;
			} else if (op.equals("c")) {
				num0 = 0.0;
				System.out.println("ans: " + num0);
			} else {
				if (firsttime) {
					System.out.print("2nd input: ");
				} else {
					System.out.print("more input: ");
				}
				input1 = userInput.next();
				num1 = Double.parseDouble(input1);

				switch (op) {
					case "+": answer = num0 + num1; break;
					case "-": answer = num0 - num1; break;
					case "*": answer = num0 * num1; break;
					case "/": answer = num0 / num1; 
							if(num1 == 0) {
								dividebyzero = true;
							}								
							break;
					default: unknownoperator = true; break;
				}

				if (dividebyzero) {
					System.out.println("Error: You cannot divide by 0.");
					dividebyzero = false;
				} else if (unknownoperator) {
					System.out.println("Error: Unknown operator " + op);
					unknownoperator = false;
				} else {
					System.out.println("ans: " + answer);
					num0 = answer;
				}
			}
		}

	}
	
}