package simpleExceptions;

public class BadIntegerFixedModular {

	public static void main(String[] args) {
		IntScanner scan = new IntScanner(System.in);
		int input = 0;
		do {
			System.out.print("Please enter an integer: ");
			input = scan.nextInt();
			System.out.println("You entered " + input);
		} while (input != 99);
	}

}
