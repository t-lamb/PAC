/* 
Teresa Lamb
PAC I - Lab 8: Dessert Shoppe - Due 11/25/15
*/
public class Cookie extends DessertItem{
	private int numCookies;
	private int pricePerDozen;

	public Cookie(String name, int numCookies, int pricePerDozen){
		super(name);
		this.numCookies = numCookies;
		this.pricePerDozen = pricePerDozen;
	}

	public int getCost(){
		int cost = (int)Math.round(numCookies * pricePerDozen / 12);
		return cost;
	}

	public int getNumCookies(){
		return numCookies;
	}

	public int getPricePerDozen(){
		return pricePerDozen;
	}
}

/*
The Cookie class should be derived from the DessertItem class. 
A Cookie item has a number and a price per dozen which are used to 
determine its cost. For example, 4 cookies @ 399 cents /dz. = 133 cents. 
The cost should be rounded to the nearest cent.
*/