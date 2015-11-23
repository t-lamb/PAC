import java.util.Scanner;

public class Hospital {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String input = "";

		double totalCharge = 0;
		double overnightCharge = 0;
		double labCharge = 0;
		double rxCharge = 0;

		boolean quit = false;

		do {

			//get overnight charge
			if (overnightCheck() == true) {
				System.out.println("Enter overnight charge:");
				overnightCharge = scan.nextDouble();
			} else {
				overnightCharge = 0;
			}
			
			//get lab charge
			System.out.println("Enter lab charge:");	
			labCharge = scan.nextDouble();

			//get medication charge
			System.out.println("Enter medication charge:");	
			rxCharge = scan.nextDouble();

			//use getTotal method to get total
			totalCharge = getTotal(overnightCharge, rxCharge, labCharge);

			//print total
			System.out.println("Your total is $" + totalCharge);

			//repeat loop?
			System.out.println("Would you like to check out another patient? (y/n)");
			input = scan.next();

			if (input.equalsIgnoreCase("n")){
				quit = true;
			}

		} while (!quit);

	}

	static boolean overnightCheck() {
			Scanner scan = new Scanner(System.in);
			String input;			
			System.out.println("Will you be staying overnight? (y/n)");
			input = scan.next();

			if (input.equalsIgnoreCase("y")){
				return true;
			} else {
				return false;
			}
	} 

	static double getTotal(double inovernightcharge, double inlabcharge, double inrxcharge){
		return inovernightcharge + inlabcharge + inrxcharge;
	}
}