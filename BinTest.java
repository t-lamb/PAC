import java.util.Scanner;
public class BinTest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		//int input = value;
		String bin = "";
		int bit = 2;
		int input = in.nextInt();

		for (int i = 0; input != 0; i++){
			int remainder = input % bit;
			String outString;

			//if there is no remainder
			if (remainder == 0) {
				outString = "0";			
			}
			else { //there is a remainder
				outString = "1";
				input -= remainder;
			}
			bin = outString + bin;
			System.out.print("Input: " + input);
			System.out.println(" Bin: " + bin);
			bit *= 2;
		}
	}
}