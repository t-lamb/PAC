import java.util.Scanner;

public class Calc {
	public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);
	String input0, input1;
	String op = "";
	Double num0 = 0.0;
	Double num1 = 0.0;
	Double answer = 0.0;
	Boolean firsttime = true;
	Boolean quit = true;

		while (quit) {
			System.out.println("type c to clear. type x to exit");
			
			if (firsttime) {
				System.out.print("1st input: ");
				input0 = userInput.next();
				num0 = Double.parseDouble(input0);
				firsttime = false;
			}

			System.out.print("op: ");
			op = userInput.next();

			if (op.equals("x")) {
				quit = false;
			} else {

				System.out.print("2nd input: ");
				input1 = userInput.next();
				num1 = Double.parseDouble(input1);

				switch (op) {
					case "+": answer = num0 + num1; break;
					case "-": answer = num0 - num1; break;
					case "*": answer = num0 * num1; break;
					case "/": answer = num0 / num1; break;
					case "c": answer = 0.0; break;
					default: System.out.println("Err"); break;
				}

				System.out.println("ans: " + answer);
				num0 = answer;
			}
		}

	}
	
}