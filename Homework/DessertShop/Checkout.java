public class Checkout{
	public static int numberOfItems = 0;
	private DessertItem[] itemArray;

	public Checkout(){
		this.itemArray = new DessertItem[100];
	}

	public void enterItem(DessertItem newItem){
		itemArray[numberOfItems] = newItem;
		numberOfItems++;
	}

	public void clear(){
		itemArray = new DessertItem[100];
		numberOfItems = 0;
	}

	public int numberOfItems(){
		return numberOfItems;
	}

	public int totalCost(){ // without tax
		int cost = 0;
		for (int i = 0; i < numberOfItems; i++){
			cost += itemArray[i].getCost();
		}
		return cost;
	}

	public int totalTax(){
		return (int)Math.round(totalCost() * DessertShoppe.TAX_RATE /100); 
	}

	public java.lang.String toString(){
		String s = String.format("\t%s\n\t--------------------\n\n", DessertShoppe.STORE_NAME);
		for (int i = 0; i < numberOfItems; i++){
			if (itemArray[i] instanceof Candy){
				String candyWeight = ((Candy)itemArray[i]).getWeight();
				String candyCost = DessertShoppe.cents2dollarsAndCents(((Candy)itemArray[i]).getPricePerLb());
				s += String.format("%s lbs. @ %s /lb.\n", candyWeight, candyCost);
			}
			if (itemArray[i] instanceof Cookie){
				String numCookies = ((Cookie)itemArray[i]).getNumCookies();
				String cookieCost = DessertShoppe.cents2dollarsAndCents(((Cookie)itemArray[i]).getPricePerDozen());
				s += String.format("%s @ %s /dz.\n", numCookies, cookieCost);
			}
			if (itemArray[i] instanceof Sundae){
				String nameTopping = ((Sundae)itemArray[i]).getNameTopping();
				s += String.format("%s Sundae with\n", nameTopping);
			}
			String itemName = itemArray[i].getName();
			if (itemName.length() < 12){
				itemName += "\t";
			}
			String itemCost = DessertShoppe.cents2dollarsAndCents(itemArray[i].getCost());
			s += String.format("%s \t\t %s\n", itemName, itemCost);
		}
		s += String.format("Tax\t\t\t\t  %s \nTotal Cost\t\t\t%s", DessertShoppe.cents2dollarsAndCents(totalTax()), DessertShoppe.cents2dollarsAndCents(totalTax() + totalCost()));
		return s;
	}
}