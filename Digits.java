/* Main calls method 100x generating random numbers between 1 - 10,000
Methodeturns number of digits in an int
*/

public class Digits {
	public static void main(String args[]){
		int num;
		int numDigits;

		for (int i = 0; i < 100; i++){
			num = (int )Math.random() * 10000 + 1;
			numDigits = getDigitNum(num);
		}
	}
	public static int getDigitNum(int inNum){
		String stringNum = Integer.toString(inNum);
		return stringNum.length();
	}
}