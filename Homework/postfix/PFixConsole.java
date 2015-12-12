import java.util.Scanner;

public class PFixConsole {
	public static void main(String args[]){
		Scanner conIn = new Scanner(System.in);

		String line = null; //String to be evaluated
		String more = null; //used to stop or continue processing

		int result; // result of evaluation

		do{
			//Get expression
			System.out.println("Enter a postfix expression to be evaluated: ");
			line = conIn.nextLine();

			//Obtain and output result of expression evaluated
			try {
				result = PostFixEvaluator.evaluate(line);

				//Output result
				System.out.println();
				System.out.println("Result = " + result);

			} catch (PostFixException error) {
				//Output error message
				System.out.println();
				System.out.println("Error in expression - " + error.getMessage());
			}

			//Determine if there is another expression to process
			System.out.println();
			System.out.println("Evaluate another expression? (y = yes): ");
			more = conIn.nextLine();

		} while(more.equalsIgnoreCase("y"));

		System.out.println("Program completed.");
	}
}