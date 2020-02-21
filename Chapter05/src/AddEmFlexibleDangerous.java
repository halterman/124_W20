
public class AddEmFlexibleDangerous {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		System.out.print("Please enter the number of values to add: ");
		int numberCount = scan.nextInt();
		int[] numberList = new int[numberCount];
		int sum = 0;
		// Prompt the user for input
		System.out.print("Please enter " + numberCount + " numbers: ");
		// Get the numbers from the user and put them into our array
		for (int i = 0; i < numberCount; i++) {
			numberList[i] = scan.nextInt();
		}
		scan.close();
		numberCount = 100;
		// Add all the numbers together
		for (int i = 0; i < numberCount; i++) {
			sum += numberList[i];
		}

		// Report the result to the user
		System.out.print(numberList[0]);
		for (int i = 1; i < numberCount; i++) {
			System.out.print(" + " + numberList[i]);
		}
		System.out.println(" = " + sum);

	}

}
