package simpleExceptions;

public class DivideByZero {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		int dividend, divisor;
		do {
			System.out.print("Please enter integer dividend and divisor: ");
			dividend = scan.nextInt();
			divisor = scan.nextInt();
			System.out.printf("%d/%d = %d, remainder %d%n", dividend, divisor, 
					          (dividend / divisor), (dividend % divisor));
		} while (dividend != 999);
		scan.close();
	}
}
