package checkedExceptionExample;

import java.util.Scanner;

public class ConsoleRead {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter nonnegative integers (negative ends list): ");
		int sum = 0;
		int input;
		while (true) {
			input = scan.nextInt();
			if (input < 0) {
				break;
			}
			sum += input;
		}
		
		scan.close();
		System.out.println("Sum = " + sum);
	}

}
