/**
 * Abstract superclass for Dessert Item hierarchy
 */
/* 
PAC I - Lab 8: Dessert Shoppe - Due 11/25/15
Provided file - Do Not Change
*/
public abstract class DessertItem{

	protected String name;

	public DessertItem(){
		this("");
	}

	public DessertItem(String name){
		if (name.length() <= DessertShoppe.MAX_ITEM_NAME_SIZE){
			this.name = name;
		} else {
			this.name = name.substring(0,DessertShoppe.MAX_ITEM_NAME_SIZE);
		}
	}

	public final String getName(){
		return name;
	}

	public abstract int getCost(); 
}