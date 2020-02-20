
public class AddEmCh02 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		// Prompt the user for input
		System.out.print("Please enter 5 numbers: ");
		var scan = new java.util.Scanner(System.in);
		// Get the numbers from the user
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		scan.close();
		// Compute the sum
		int sum = num1 + num2 + num3 + num4 + num5;
		// Report the result to the user
		System.out.println(num1 + " + " + num2 + " + " + num3 + " + "
				           + num4 + " + " + num5 + " = " + sum);

	}

}
