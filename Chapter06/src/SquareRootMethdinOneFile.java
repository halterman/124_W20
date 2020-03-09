
public class SquareRootMethdinOneFile {

	public static double sqrt(double arg) {
		double r = 1.0;
		while (Math.abs(r * r - arg) > 0.0000000001) {
			r = (r + arg / r) / 2;
		}
		return r;
	}
	
	public static int minimum(int m, int n) {
		if (m < n) {
			return m;
		} else {
			return n;
		}
	}
	
	public static void bar(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Using the MyMath.sqrt method");
		for (double i = 1.0; i < 10.0; i += 0.5) {
			System.out.println(sqrt(i) + " " + Math.sqrt(i));
		}
		
		int min = minimum(10, 5);
		System.out.println("min = " + min);
		min = minimum(10, 25);
		System.out.println("min = " + min);
		
		bar(10);
		bar(3);
		bar(0);
		bar(-5);
		bar(20);
	}

}
