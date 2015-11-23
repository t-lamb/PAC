public class Quiz {
	public static void main(String [] args){
		boolean[] myArray = new boolean[100];
		myArray = updateArray(myArray);

		for (int i = 0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}
	public static boolean[] updateArray(boolean[] inArray){

		for (int i = 0; i < inArray.length; i++){
			if (i%6 == 0){
				inArray[i] = true;
			}
		}

		return inArray;
	}
}