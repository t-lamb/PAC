public class Cylinder extends Circle 
{
	private double height; 
	
	public Cylinder()
	{
		this(0,0);
	} 
	
	public Cylinder( double radius, double height )
	{
		super( radius ); 

		setHeight( height);
	} 
	
	public void setHeight( double heightValue )
	{
		height = ( heightValue < 0.0 ? 0.0 : heightValue);
	} 
	
	public double getHeight()
	{
		return height;
	} 
	
	public double getArea()
	{
		return 2 * super.getArea() + getPerimeter() * getHeight();
	} 
	
	public double getVolume()
	{
		return super.getArea() * getHeight();
	} 
	
	//Note: Using Circle's toString()
	public String toString()
	{
		return super.toString() + "; Height: " + getHeight();
	}

//added the following equals()
	
	public boolean equals (Object o)
	{
		if (!(o instanceof Cylinder))
			return false;
		else 
			return (super.equals(o) && (this.height == ((Cylinder)o).height));
	}
} 