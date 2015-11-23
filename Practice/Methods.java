import util.java.Scanner

public class Methods {
	public static void main(String[] args){
		double total = getTotal();
		print(total);
	}
	public static double getTotal(){
		Scanner scan = new Scanner(System.in);
		double totes = 0;
		boolean moreItems = true;
		char response;

		while(moreItems){
			totes += getItemPrice(getItemName());
			response = scan.next().charAt(0);
			if (response != 'y' && response != 'Y'){
				moreItems = false;
				scan.nextLine();
			}
		}
		return totes;
	}
	public static String getItemName(){
		Scanner scan = new Scanner(System.in);
		String name;
		
		System.out.println("Enter Item Name:");
		name = scan.nextLine();

		return name;
	}
	public static double getItemPrice(String inName){
		Scanner scan = new Scanner(System.in);
		double price = 0;

		System.out.println("Enter Item Price for " + inName +":");
		price = scan.nextDouble();

		int quantity = getItemQuatity();

		return quantity * price;
	}
	public static int getItemQuatity(){
		Scanner scan = new Scanner(System.in);
		int quant = 0;

		System.out.println("Enter quantity for this item:");
		quant = scan.nextInt();

		return quant;		
	}
	public static void print(double inTotal){
		System.out.println("Your total is " + inTotal +. );

	}
}