public class GeometricObject 
{
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object */
	public GeometricObject() 
	{	
		if (TestCircleRectangle.TRACE_CONSTRUCTOR_INVOCATION) 
			System.out.println("constructing GeometricObject");
		dateCreated = new java.util.Date();
	}
	
	/** Return color */
	public String getColor() 
	{
		return color;
	}
	
	/** Set a new color */
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	/** Return filled. Since filled is boolean,
	so, the get method name is isFilled */
	public boolean isFilled() 
	{
		return filled;
	}
	
	/** Set a new filled */
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}
	
	/** Get dateCreated */
	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}

//there is no equals method is this class
	
	/** Return a string representation of this object */
	public String toString() 
	{
		return "created on " + dateCreated + "\ncolor: " + color +
		" and filled: " + filled;
	}
}

