import java.util.Scanner;
public class Calculator{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		String line = null; //String to be evaluated
		String more = null; //used to stop or continue processing

		int result; // result of evaluation

		do{
			//Get expression
			System.out.println("Enter an infix expression to be evaluated: ");
			line = scan.nextLine();
			Converter conv = new Converter(line);
			String converted = conv.toPostFix();
			System.out.println(converted);

			//Obtain and output result of expression evaluated
			try {
				result = evaluate(converted);

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
			System.out.println("Evaluate another expression? (y = yes)");
			more = scan.nextLine();

		} while(more.equalsIgnoreCase("y"));

		System.out.println("Program completed.");
	}

	public static int evaluate(String expression){
		BoundedStackInterface<Integer> stack = new ArrayStack<Integer>(50);

		int value;
		String operator;

		int operand1;
		int operand2;

		int result = 0;

		Scanner tokenizer = new Scanner(expression);

		while(tokenizer.hasNext()){
			if (tokenizer.hasNextInt()){
				//Process operand
				value = tokenizer.nextInt();
				if (stack.isFull())
					throw new PostFixException("Too many operands - stack overflow");
				stack.push(value);
			} else {
				//Process operator
				operator = tokenizer.next();

				//Obtain second operand from stack.
				if(stack.isEmpty())
					throw new PostFixException("Not enough operands - stack underflow");
				operand2 = stack.top();
				stack.pop();

				//Obtain first operand from stack.
				if (stack.isEmpty())
					throw new PostFixException("Not enough operands - stack underflow");
				operand1 = stack.top();
				stack.pop();

				//Perform operation
				if (operator.equals("/"))
					result = operand1 / operand2;
				else
				if (operator.equals("*"))
					result = operand1 * operand2;
				else
				if (operator.equals("+"))
					result = operand1 + operand2;
				else
				if (operator.equals("-"))
					result = operand1 - operand2;
				else
				if (operator.equals("^"))
					result = (int)Math.pow((double)operand1, (double)operand2);
				else
					throw new PostFixException("Illegal symbol: " + operator);

				//Push result of operation to stack
				stack.push(result);
			}
		}

		//Obtain final result from stack
		if (stack.isEmpty())
			throw new PostFixException("Not enough operands - stack underflow");
		result = stack.top();
		stack.pop();

		//Stack should not be empty
		if(!stack.isEmpty())
			throw new PostFixException("Too many operands - operands left over");
		
		//Return final result
		return result;
		
	}
}
	
