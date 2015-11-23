import java.util.Scanner;
public class HexTest{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int inDec = in.nextInt();
		String hex = "";
		int hexVal = 16;

		while(inDec > 0){
			String newHex;
			int remainder = inDec % hexVal;

			switch (remainder) {
				case 10: newHex = "A";
						break;
				case 11: newHex = "B";
						break;
				case 12: newHex = "C";
						break;
				case 13: newHex = "D";
						break;
				case 14: newHex = "E";
						break;
				case 15: newHex = "F";
						break;
				default: newHex = String.valueOf(remainder);
						break;
			}
		
			hex = newHex + hex;
			System.out.println("hex: " + hex);
			inDec = inDec/hexVal;

		}
	}
}