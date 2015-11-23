public class IceCream extends DessertItem{
	private int cost;

	public IceCream(String name, int cost){
		super(name);
		this.cost = cost;
	}

	public int getCost(){
		return cost;
	}
	
}

/*
The IceCream class should be derived from the DessertItem class. 
An IceCream item simply has a cost.
*/