public class Rectangle extends GeometricObject 
{
	private double width;
	private double height;
	
	public Rectangle() 
	{
		this (0,0);
	}
	
	public Rectangle(double width, double height) 
	{	
		if (TestCircleRectangle.TRACE_CONSTRUCTOR_INVOCATION) 
			System.out.println("constructing Rectangle");

		this.width = width;
		this.height = height;
	}
	
	/** Return width */
	public double getWidth() 
	{
		return width;
	}
	
	/** Set a new width */
	public void setWidth(double width) 
	{
		this.width = width;
	}
	
	/** Return height */
	public double getHeight() 
	{
		return height;
	}
	
	/** Set a new height */
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	/** Return area */
	public double getArea() 
	{
		return width * height;
	}
	
	/** Return perimeter */
	public double getPerimeter() 
	{
		String s = toString();
		return 2 * (width + height);
	}
	
	public boolean equals (Object o)
	{
		if (!(o instanceof Rectangle))
			return false;
		
		Rectangle other  = (Rectangle)o;
		
		return ((this.width == other.width) && (this.height == other.height));	
	}
	
	public String toString()
	{
		return "This is a Rectangle " + 
				super.toString() + "; area " + getArea();
	}
	
}

