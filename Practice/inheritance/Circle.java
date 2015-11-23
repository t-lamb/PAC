public class Circle extends GeometricObject 
{
	private double radius;
	
	public Circle() 
	{
		this(0);
	}
	
	public Circle(double radius) 
	{
		if (TestCircleRectangle.TRACE_CONSTRUCTOR_INVOCATION) 
			System.out.println("constructing Circle");
		this.radius = radius;
	}
	
	/** Return radius */
	public double getRadius() 
	{
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	
	/** Return area */
	public double getArea() 
	{
		return radius * radius * Math.PI;
	}
	
	/** Return diameter */
	public double getDiameter() 
	{
		return 2 * radius;
	}
	
	/** Return perimeter */
	public double getPerimeter() 
	{
		return 2 * radius * Math.PI;
	}
	
	/** Print the circle info */
	public void printCircle() 
	{
		System.out.println("The circle is created " + getDateCreated() +
		" and the radius is " + radius);
	}
	
	public String toString()
	{
		return "This is a " + getClass().toString().substring(6)  + " " + 
				super.toString() + "; area " + getArea();
	}

//added the following equals method

	public boolean equals (Object o)
	{
		Circle other;
		if (o instanceof Circle)
			return (this.radius == ((Circle)o).radius);
		else 
			return false;
	}
}


