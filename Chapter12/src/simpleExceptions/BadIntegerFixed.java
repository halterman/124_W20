package simpleExceptions;

public class BadIntegerFixed {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		int input = 0;
		boolean badInput;
		do {
			do {
				badInput = false;
				System.out.print("Please enter an integer: ");
				try {
					input = scan.nextInt();
				} catch (Exception e) {
					scan.next();
					System.out.print("Bad input, please try again. ");
					badInput = true;
				} 
			} while (badInput);
			System.out.println("You entered " + input);
		} while (input != 99);
		scan.close();
	}

}
