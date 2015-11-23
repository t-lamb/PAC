
public class TestCircleCylinderRectangle
{
	//change the following to true to watch the order of constructor invocation
	public static void main (String [] args)
	{
		GeometricObject g1, g2;
		Circle c1, c2;
		Rectangle r1, r2;
		Cylinder cy1, cy2;
		
		g1 = new GeometricObject();
		g2 = new GeometricObject();
		System.out.println("g1 instanceof GeometricObject: " + (g1 instanceof GeometricObject));
		System.out.println("g1 instanceof Circle: " + (g1 instanceof Circle));
		System.out.println("g1 instanceof Cylinder: " + (g1 instanceof Cylinder));
		System.out.println("g1 instanceof Rectangle: " + (g1 instanceof Rectangle));
		System.out.println("g1.equals(g2): " + (g1.equals(g2)));
		System.out.println();
		
		c1 = new Circle(2);
		c2 = new Circle(2);
		System.out.println("c1 instanceof GeometricObject: " + (c1 instanceof GeometricObject));
		System.out.println("c1 instanceof Circle: " + (c1 instanceof Circle));
		System.out.println("c1 instanceof Cylinder: " + (c1 instanceof Cylinder));
		System.out.println("c1.equals(c2): " + (c1.equals(c2)));
		System.out.println();
		
		r1 = new Rectangle(2,4);
		r2 = new Rectangle(4,2);
		System.out.println("r1 instanceof GeometricObject: " + (r1 instanceof GeometricObject));
		System.out.println("r1 instanceof Rectangle: " + (r1 instanceof Rectangle));
		System.out.println("r1.equals(r2): " + (r1.equals(r2)));
		System.out.println();

		cy1 = new Cylinder(2,4);
		cy2 = new Cylinder(2,4);
		System.out.println("cy1 instanceof GeometricObject: " + (cy1 instanceof GeometricObject));
		System.out.println("cy1 instanceof Circle: " + (cy1 instanceof Circle));
		System.out.println("cy1 instanceof Cylinder: " + (cy1 instanceof Cylinder));

		//compile time error since a cylinder can NEVER be a Rectangle
		//System.out.println("cy1 instanceof Rectangle" + (cy1 instanceof Rectangle));

		System.out.println("cy1.equals(cy2): " + (cy1.equals(cy2)));
		System.out.println();
		


		System.exit(0);		
	}
}