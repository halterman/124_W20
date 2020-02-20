
public class AddEmCh04 {

	public static void main(String[] args) {
		final int NUMBER_COUNT = 5;
		int num;
		int sum = 0;
		// Prompt the user for input
		System.out.print("Please enter " + NUMBER_COUNT + " numbers: ");
		var scan = new java.util.Scanner(System.in);
		// Get the numbers from the user
		for (int count = 0; count < NUMBER_COUNT; count++) {
			num = scan.nextInt();
			sum += num;
		}
		scan.close();
		// Report the result to the user
		System.out.println("The sum is " + sum);

	}

}
