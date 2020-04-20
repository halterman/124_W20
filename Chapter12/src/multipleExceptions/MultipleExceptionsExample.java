package multipleExceptions;

import java.util.InputMismatchException;

public class MultipleExceptionsExample {

	private static void arrayException() {
		int[] a = new int[0];      // Empty array
		System.out.println(a[0]);  // Trouble
	}
	
	private static void badDivision() {
		System.out.println(1/0);
	}
	
	private static void badFormat() {
		System.out.printf("%d%n", 0.5);
	}
	
	private static void multiExcept(int n) {
		switch (n) {
			case 1: 
				arrayException();
			case 2:
				badDivision();
			case 3:
				badFormat();
				break;
			default:
				break;
		}
	
	}

	public static void main(String[] args) {
		System.out.println("Start of main---------");
		try {
			var scan = new java.util.Scanner(System.in);
			System.out.print("Enter 1, 2, or 3: ");
			multiExcept(scan.nextInt());
			System.out.println("No exception occurred");
			scan.close();
			
		} catch (ArrayIndexOutOfBoundsException e) {  
			System.out.println("An array index out of bounds exception occurred");
		} catch (IllegalArgumentException e) {  
			System.out.println("An illegal argument exception occurred");
		} catch (InputMismatchException e) {  
			System.out.println("An input mismatch exception occurred");
		} catch (Exception e) {  // The "catch-all" exception
			System.out.println("Some other exception occurred (" + e + ")");
		}
		System.out.println("End of main---------");

	}

}
