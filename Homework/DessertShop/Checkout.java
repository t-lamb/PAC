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
		String s = String.format("\t %s \n\t-----------------\n\n", DessertShoppe.STORE_NAME);
		for (int i = 0; i < numberOfItems; i++){
			s += String.format("%s \t %s\n", itemArray[i].getName(), DessertShoppe.cents2dollarsAndCents(itemArray[i].getCost()));
		}
		s += String.format("Tax\t %s \nTotal Cost\t %s", DessertShoppe.cents2dollarsAndCents(totalTax()), DessertShoppe.cents2dollarsAndCents(totalTax() + totalCost()));
		return s;
	}
}