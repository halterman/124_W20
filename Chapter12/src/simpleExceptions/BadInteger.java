package simpleExceptions;

public class BadInteger {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		int input;
		do {
			System.out.print("Please enter an integer: ");
			input = scan.nextInt();
			System.out.println("You entered " + input);
		} while (input != 99);
		scan.close();
	}

}
