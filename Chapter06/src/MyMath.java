
public class MyMath {

	/**
	 * Computes the square root of the parameter {@code arg}.
	 * @param arg the value to find the square root of
	 * @return the square root of {@code arg}
	 */
	public static double sqrt(double arg) {
		double r = 1.0;
		while (Math.abs(r * r - arg) > 0.0000000001) {
			r = (r + arg / r) / 2;
		}
		return r;
	}
	
	/**
	 * Computes the smaller of the two parameters
	 * @param m one of the parameters
	 * @param n the other parameter
	 * @return the minimum of {@code m} and {@code n}
	 */
	public static int minimum(int m, int n) {
		if (m < n) {
			return m;
		} else {
			return n;
		}
	}

}
