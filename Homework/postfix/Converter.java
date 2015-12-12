import java.util.Scanner;

public class Converter{
	private String inFix;
	public Converter(String inFix){
		this.inFix = inFix;
	}
	public String toPostFix(){
		String pFix = "";
		BoundedStackInterface<String> stack = new ArrayStack<String>();
		Scanner tokenizer = new Scanner(inFix);

		while(tokenizer.hasNext()){
			if (tokenizer.hasNextInt()){
				//found operand
				int operand = tokenizer.nextInt();
				pFix += (operand + " ");
			} else {
				//found operator
				String operator = tokenizer.next();
				if (stack.isFull()){
					throw new PostFixException("Too many operands - stack overflow");
				}

				if (operator.equals(")")){
					String lastOp = stack.top();
					while (!lastOp.equals("(")){
						pFix += (lastOp + " ");
						stack.pop();
					}
					stack.pop();
				} else {
					if (operator.equals("/") || operator.equals("*")){
						String lastOp = stack.top();
						if (lastOp.equals("/") || lastOp.equals("*")){
							pFix += (lastOp + " ");	
							stack.pop();	
						}
					}
					stack.push(operator);
				}
				
			}
		}

		while (!stack.isEmpty()){
			pFix += (stack.top() + " ");	
			stack.pop();
		}

		return pFix;
	}
}