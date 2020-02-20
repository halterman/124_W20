
public class AddEmCh05 {

	public static void main(String[] args) {
		final int NUMBER_COUNT = 5;
		int[] numberList = new int[NUMBER_COUNT];
		int sum = 0;
		// Prompt the user for input
		System.out.print("Please enter " + NUMBER_COUNT + " numbers: ");
		var scan = new java.util.Scanner(System.in);
		// Get the numbers from the user and put them into our array
		for (int i = 0; i < NUMBER_COUNT; i++) {
			numberList[i] = scan.nextInt();
		}
		scan.close();
		// Add all the numbers together
		for (int i = 0; i < NUMBER_COUNT; i++) {
			sum += numberList[i];
		}
		scan.close();

		// Report the result to the user
		System.out.print(numberList[0]);
		for (int i = 1; i < NUMBER_COUNT; i++) {
			System.out.print(" + " + numberList[i]);
		}
		System.out.println(" = " + sum);

	}

}
