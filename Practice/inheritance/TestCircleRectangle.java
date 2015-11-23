public class TestCircleRectangle
{
	//make this variable true if you want to trace the 
	//invocation of the various constructors
	
	public static boolean TRACE_CONSTRUCTOR_INVOCATION = false;
	
	public static void main (String [] args)
	{
		Circle circle = new Circle(1);
		System.out.println("A circle (toString()):\n\t" + circle.toString());

		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		System.out.println();

		Rectangle rectangle = new Rectangle(2,4);
		System.out.println("The color is " + rectangle.getColor());
		System.out.println("A rectangle (toString()):\n\t " +  rectangle);
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
		System.out.println();
		
		System.exit(0);		
	}
}


