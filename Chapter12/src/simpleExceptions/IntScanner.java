package simpleExceptions;

import java.io.InputStream;
import java.util.Scanner;

public class IntScanner {
	private Scanner scanner;
	
	public IntScanner(InputStream in) {
		scanner = new Scanner(in);
	}
	
	public int nextInt() {
		int input = 0;
		boolean badInput;
		do {
			badInput = false;
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				scanner.next();   // Clear the bad characters from the keyboard buffer
				System.out.print("Bad input, please try again. ");
				badInput = true;
			} 
		} while (badInput);
		return input;
	}

}
