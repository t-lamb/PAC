/* 
Teresa Lamb
PAC I - Lab 8: Dessert Shoppe - Due 11/25/15
*/
public class Sundae extends IceCream{
	private String nameTopping;
	private int costTopping;

	public Sundae(String nameIceCream, int costIcecream, String nameTopping, int costTopping){
		super(nameIceCream, costIcecream);
		this.nameTopping = nameTopping;
		this.costTopping = costTopping;
	}

	public int getCost(){
		return super.getCost() + costTopping;
	}

	public String getNameTopping(){
		return nameTopping;
	}
	
}

/*
The Sundae class should be derived from the IceCream class. 
The cost of a Sundae is the cost of the IceCream plus the 
cost of the topping.
*/