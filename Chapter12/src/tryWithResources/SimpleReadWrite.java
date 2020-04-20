package tryWithResources;

import java.util.Scanner;

public class SimpleReadWrite {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Please enter an integer: ");
			int input = scan.nextInt();
			System.out.println("You entered " + input);
		}
	}

}
