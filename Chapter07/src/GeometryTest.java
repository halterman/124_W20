import geometry124.Geometry;
import geometry124.Line;
import geometry124.Point;

public class GeometryTest {

	public static void main(String[] args) {
		Point point1 = new Point(1, 1);
		Point point2 = new Point(0, 0);

		System.out.println("Distance from the Geometry class: " + Geometry.distance(point1, point2));
		System.out.println("Distance from the Point class: " + point1.distance(point2));
		System.out.println("-------------------------------------------------");
		System.out.println(Geometry.floatEquals(3.00000003, 2.9999999996));
		
		Point pt;
		pt = new Point(7.5, 0.4);
		System.out.println("the point is " + pt);
		
		System.out.println("The midpoint of " + point1 + " and " + point2 + " is "
				           + Geometry.midpoint(point1, point2));
		System.out.println("The midpoint of " + point1 + " and " + point2 + " is "
				           + point1.midpoint(point2));
		System.out.println("-------------------------------------------------");
		Point point3 = new Point(4, 5);
		Point point4 = new Point();
		System.out.println("Point 3 is " + point3 + " and Point 4 is " + point4);
		System.out.println("-------------------------------------------------");
		Line myLine = new Line(0.5, 9);
		System.out.println("myLine = " + myLine);
		
	}

}
