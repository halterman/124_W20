package geometry124;

public class Geometry {
	
	/**
	 * Test to see if two double-precision floating-point
	 * values are "equal."  The values are considered 
	 * equal when their difference is small.
	 * @param a one of the numbers to compare
	 * @param b the other number to compare
	 * @return true, if the values of the two parameters 
	 *         {@code a} and {@code b} are close enough 
	 *         to be considered equal; otherwise, returns false
	 */
	public static boolean floatEquals(double a, double b) {
		return a == b || Math.abs(a - b) < 0.0000001;
	}

	/**
	 * Computes the distance between the geometric points
	 * {@code p1} and {@code p2}
	 * @param p1 one of the points
	 * @param p2 the other point
	 * @return the distance between points {@code p1} and {@code p2}
	 */
	public static double distance(Point p1, Point p2) {
//		double x1 = p1.x, 
//			   y1 = p1.y, 
//			   x2 = p2.x, 
//			   y2 = p2.y;
//		
//		return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		
		return p1.distance(p2);
	}
	
	public static Point midpoint(Point p1, Point p2) {
//		double midX = (p1.x + p2.x)/2;
//		double midY = (p1.y + p2.y)/2;
//		Point result = new Point(midX, midY);
//		return result;

//		return new Point((p1.x + p2.x)/2, (p1.y + p2.y)/2);
		
		return p1.midpoint(p2);
	}

}
