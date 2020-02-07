import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print("Please enter an integer in the range 0...1,023: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (0 <= number && number < 1024) {
			if (number >= 512) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 512;
			if (number >= 256) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 256;
			if (number >= 128) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 128;
			if (number >= 64) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 64;
			if (number >= 32) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 32;
			if (number >= 16) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 16;
			if (number >= 8) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 8;
			if (number >= 4) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 4;
			if (number >= 2) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
			number %= 2;
			System.out.println(number);
		}

	}

}
