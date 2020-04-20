package multipleExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileReadExample {
	
	private static int[] readFile(String filename) {
		int[] result = null;
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(new File(filename));
			// Read the number of elements
			int numberOfElements = fileScanner.nextInt();
			result = new int[numberOfElements];
			for (int i = 0; i <= result.length; i++) {
				result[i] = fileScanner.nextInt();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		try {
			var scan = new java.util.Scanner(System.in);
			System.out.print("Enter file name: ");
			int[] arr = readFile(scan.next());
			System.out.println(Arrays.toString(arr));
			System.out.println("No exception occurred");
			
		} catch (ArrayIndexOutOfBoundsException e) {  // The "catch-all" exception
			System.out.println("An array index out of bounds exception occurred");
		} catch (IllegalArgumentException e) {  // The "catch-all" exception
			System.out.println("An illegal argument exception occurred");
		} catch (InputMismatchException e) {  // The "catch-all" exception
			System.out.println("An input mismatch exception occurred");
		} catch (Exception e) {  // The "catch-all" exception
			System.out.println("Some other exception occurred (" + e + ")");
		}

	}

}
