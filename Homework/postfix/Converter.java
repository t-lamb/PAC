import java.util.Scanner;

public class Converter{
	private String inFix = "";
	public Converter(String inFix){
		this.inFix = inFix;
	}
	public String toPostFix(){
		String pFix = "";
		BoundedStackInterface<String> stack = new ArrayStack<String>();

		for (int i = 0; i < inFix.length(); i++){
			//loop through all chars in inFix
			char c = inFix.charAt(i);

			if (Character.isDigit(c)){
				//found operand
				int operand = Character.getNumericValue(c);
				pFix += (operand);

			} else if (c != ' '){
				//if stack is full, throw error, stop program
				if (stack.isFull()){
					throw new PostFixException("Too many operands - stack overflow");
				}

				//found operator
				String operator = Character.toString(c);

				if (operator.equals("(")){
					stack.push(operator);
				} else if (operator.equals(")")){
					pFix += " ";
					String lastOp = stack.top();
					//pop and append all operands till find (
					while (!lastOp.equals("(")){
						System.out.println("checking" + lastOp);
						pFix += (lastOp + " ");
						stack.pop();
						lastOp = stack.top();	
					}
					//then pop (
					//do not append parentheses
					stack.pop();
				} else {
					pFix += " ";

					if (operator.equals("^")){
						if(!stack.isEmpty()) {
							String lastOp = stack.top();
							if (lastOp.equals("^")){
								pFix += (lastOp + " ");	
								stack.pop();	
							}	
						}
					} else if (operator.equals("/") || operator.equals("*")){
						if(!stack.isEmpty()) {
							String lastOp = stack.top();
							if (lastOp.equals("/") || lastOp.equals("*") || lastOp.equals("^")){
								pFix += (lastOp + " ");	
								stack.pop();	
							}
						}
					}
					stack.push(operator);
				}	
			} else {
				pFix = pFix;
			}
		}

		while (!stack.isEmpty()){
			pFix += (" " + stack.top());	
			stack.pop();
		}

		return pFix;
	}
}