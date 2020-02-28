
public class SquareRootCh04 {

	public static void main(String[] args) {
//		var scan = new java.util.Scanner(System.in);
//		double i = scan.nextDouble();
		
		for (double i = 1.0; i < 10.0; i += 0.5) {
			double r = 1.0;
			while (Math.abs(r * r - i) > 0.0000001) {
				r = (r + i / r) / 2;
			}
			System.out.println(r + " " + Math.sqrt(i));
		}
		
//		System.out.println("The square root of " + i + " is " + r);


	}

}
