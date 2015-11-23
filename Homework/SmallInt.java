/* 
Teresa Lamb
PAC I - Lab 6 - Due 11/4/15
*/

public class SmallInt {
	private int value;
	public static final int MAXVALUE = 1000;

	SmallInt(int input) {
		setDec(input);
	}

	public String getDec(){
		String dec = "" + Integer.toString(value);
		return dec;
	}

	public void setDec(int newInt){
		if (newInt < MAXVALUE && newInt > 0) {
			value = newInt;
		} else {
			System.out.println("Err: Please enter an integer between 0 and " + MAXVALUE + ".");
			value = 0;
		}
	}

	public String getBin(){
		int inDec = value;
		String bin = "";
		int bitVal = 2;

		while(inDec > 0){
			int remainder = inDec % bitVal;
			String newBit;

			if (remainder == 0) {
				//if there is no remainder, this bit is empty
				newBit = "0";	
			} else {
				//if there is a remainder, give bit a value of 1 
				newBit = "1";
				//remove remainder from input value
				inDec -= remainder;
			}
			//add value of bit to front of current string
			bin = newBit + bin;
			//update bitVal, so we can evaluate the next power of 2
			bitVal *= 2;

			/*
			EXAMPLE
			if value is 71, that becomes our decimal input value (inDec)
			round 0: inDec = 71
				71 % 2 = 1
				with a remainder, we know there is data in the first bit value
				newBit = "1"
				we subtract the remainder so we can evaluate the rest of the value 
				inDec = 71 - 1
				bin = "1"
			round 1: inDec = 70
				70 % 4 = 2
				inDec = 70 - 2
				bin = "11"
			round 2: inDec = 68
				68 % 8 = 4
				inDec = 68 - 4
				bin = "111"
			round 3: inDec = 64
				64 % 16 = 0
				there is no remainder, so we know this bit value is empty
				newBit = "0"
				we do not need to update the inDec, since we are still looking 
				for the binary digit that represents this number
				inDec = 64
				bin = "0111"
			round 4: inDec = 64
				64 % 32 = 0
				inDec = 64
				bin = "00111"
			round 5: inDec = 64
				64 % 64 = 0
				inDec = 64
				bin = "000111"
			round 6: inDec = 64
				64 % 128 = 64
				inDec = 64 - 64
				bin = "1000111"
			inDec = 0 //loop ends
			*/
		}
		return bin;
	}

	public String getHex(){
		int inDec = value;
		String hex = "";
		int hexVal = 16;

		while(inDec > 0){
			int remainder = inDec % hexVal;
			String newHex;

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
			
			//add new hex value to left of number string
			hex = newHex + hex;
			//use integer division to remove remainder and calculate next highest hex value
			inDec = inDec/hexVal;

			/*
			EXAMPLE
			if value is 527, that becomes our decimal input value (inDec)
			round 0: inDec = 527
				remainder = 527 % 16 = 15
				//the decimal value of 15 is the hex value of F 
				newHex = "F"
				//add the new value to the empty string
				hex = "" + "F" = "F"
				//divide by 16 to find next highest digit value and remove remainder
				inDec = 527 / 16 = 32
			round 1: inDec = 32
				remainder = 32 % 16 = 0
				newHex = "0"
				//add the new value to the left of the existing string, because it is the next highest digit
				hex = "0" + "F" = "0F"
				inDec = 32 / 16 = 2
			round 2: inDec = 2
				remainder = 2 % 16 = 2
				newHex = "2"
				hex = "2" + "0F" = "20F"
				*/

		}

		return hex;
	}
}