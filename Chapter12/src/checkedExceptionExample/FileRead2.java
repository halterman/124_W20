package checkedExceptionExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan;
		scan = new Scanner(new File("data.txt"));
		int sum = 0;
		int input;
		while ((input = scan.nextInt()) >= 0) {
			sum += input;
		}
		scan.close();
		System.out.println("Sum = " + sum);
	}

}
