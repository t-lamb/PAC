import java.util.Scanner;

public class Calc {
	public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);
	int input0;
	int input1;
	String op = "";

		while(true) {
			System.out.println("type xxx to exit");
			System.out.print("1st input: ");
			//input0 = userInput.next();
			input0 = userInput.nextInt();

			System.out.print("op: ");
			//op = userInput.next();
			op = userInput.next();

			System.out.print("2nd input: ");
			//input1 = userInput.next();	
			input1 = userInput.nextInt();		

			System.out.println("Equation: " + input0 + " " + op + " " + input1);
		}

	}
	
}