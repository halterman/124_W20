package checkedExceptionExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		Scanner scan;
		try {
			scan = new Scanner(new File("data.txt"));
//			System.out.print("Enter nonnegative integers (negative ends list): ");
			int sum = 0;
			int input;
			while ((input = scan.nextInt()) >= 0) {
				sum += input;
			}
			scan.close();
			System.out.println("Sum = " + sum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		
	}

}
