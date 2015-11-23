/* 
Teresa Lamb
PAC I - Lab 2 - Due 9/23/15
Run 'Time'
*/

import java.util.Scanner;

public class Time {
	public static void main (String args[]){
		//create new Scanner object
		Scanner input = new Scanner(System.in);

		//declare variables
		int input0, input1, seconds0, seconds1, sDiff, timeDiff;

		System.out.print("Enter first time: ");
		//get input from user
		input0 = input.nextInt();
		//convert input to seconds
		seconds0 = (input0/10000) * 3600 + (input0%10000)/100 * 60 + input0%100;

		System.out.print("Enter second time: ");
		//get input from user
		input1 = input.nextInt();
		//convert input to seconds
		seconds1 = (input1/10000) * 3600 + (input1%10000)/100 * 60 + input1%100;

		//calculate difference
		sDiff = seconds0 - seconds1;

		//convert seconds to HHMMSS format
		timeDiff = (sDiff/3600) * 10000 + (sDiff%3600)/60 * 100 + (sDiff%60);

		//respond with answer
		System.out.println("Time difference: " + timeDiff);
	}
}