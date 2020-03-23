package geometry124;

/**
 * Provides the geometric point type
 */
public class Point {
	public double x;
	public double y;
	
	/**
	 * Creates and initializes a {@code Point} object
	 * @param x the <i>x</i> component of the point
	 * @param y the <i>y</i> component of the point
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Creates and initializes the point (0, 0)
	 */
	public Point() {
		this(0, 0);
	}
	
	/**
	 * Computes the distance between this {@code Point} object
	 * and {@code other}.
	 * @param other the other point
	 * @return the distance between this point and the {@code other} point
	 */
	public double distance(Point other) {
		double x1 = x, 
			   y1 = y, 
			   x2 = other.x, 
			   y2 = other.y;
			
		return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
	}
	
	/**
	 * Computes the midpoint between this point and another point
	 * @param other the other point
	 * @return the midpoint between this point and {@code other}
	 */
	public Point midpoint(Point other) {
		return new Point((x + other.x)/2, (y + other.y)/2);
	}
	
	/**
	 * Returns a human-readable version of the
	 * {@code Point} object 
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
