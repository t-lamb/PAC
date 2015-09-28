import java.util.Scanner;

public class Calc {
	public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);
	String input0;
	String input1;
	String op = "";
	Double answer = 0.0;

		while (true) {
			System.out.println("type c to clear. type x to exit");
			
			System.out.print("1st input: ");
			input0 = userInput.next();
			Double num0 = Double.parseDouble(input0);

			System.out.print("op: ");
			op = userInput.next();

			System.out.print("2nd input: ");
			input1 = userInput.next();
			Double num1 = Double.parseDouble(input1);

			switch (op) {
				case "+": answer = num0 + num1; break;
				case "-": answer = num0 - num1; break;
				case "*": answer = num0 * num1; break;
				case "/": answer = num0 / num1; break;
				case "x": break;
				case "c": break;
				default: System.out.println("Err"); break;
			}

			System.out.println("ans: " + answer);
		}

	}
	
}