public class Converter{
	private inFix;
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
				operand = tokenizer.nextInt();
				pFix += operand;
			} else {
				//found operator
				String operator = tokenizer.next();
				if (stack.isFull()){
					throw new PostFixException("Too many operands - stack overflow");
				}

				if (operator == ")"){
					String lastOp = stack.top();
					while (lastOp != "("){
						pFix += lastOp;
						stack.pop();
					}
				} else if (operator == "/" || operator == "*"){
					String lastOp = stack.top();
					if (lastOp == "/" || lastOp == "+"){
						pFix += lastOp;	
						stack.pop();	
					}
				}
				stack.push(operator);
				

				// if (stack.isFull()){
				// 	throw new PostFixException("Too many operands - stack overflow");
				// } else if(operator == "+" || "-"){
				// 	stack.push(operator);
				// } else if(operator == "/" || operator == "*"){
				// 	String lastOp = stack.top();
				// 	if (lastOp == "+" || lastOp == "-"){
				// 		stack.push(operator);	
				// 	} else {
				// 		pFix += lastOp;	
				// 		stack.pop();
				// 		stack.push(operator);					
				// 	}
				// }
			}
		}

		while (!stack.empty()){
			stack.pop();
		}

		return pFix;
	}
}