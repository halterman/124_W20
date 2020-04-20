package simpleExceptions;

public class DivideByZeroFixed {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		int dividend, divisor;
		do {
			System.out.print("Please enter integer dividend and divisor: ");
			dividend = scan.nextInt();
			divisor = scan.nextInt();
			if (divisor != 0) {
				System.out.printf("%d/%d = %d, remainder %d%n", dividend, divisor, 
								  (dividend / divisor), (dividend % divisor));
			} else {
				System.out.println("Cannot divide by zero!");
			}
		} while (dividend != 999);
		scan.close();
	}
}
