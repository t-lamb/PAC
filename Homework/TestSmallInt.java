/* 
Teresa Lamb
PAC I - Lab 6 - Due 11/4/15
run 'TestSmallInt'

This program asks user for a positive integer, 
then converts it to binary and hexadecimal values, 
and prints the results.
*/

import java.util.Scanner;

public class TestSmallInt{
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number between 0 and " + SmallInt.MAXVALUE);
		int inInt = scan.nextInt();
		SmallInt test1Int = new SmallInt(inInt);
		System.out.println("Decimal Representation: " + test1Int.getDec());
		System.out.println("Binary Representation: " + test1Int.getBin());
		System.out.println("Hexadecimal Representation: " + test1Int.getHex());
	}
}