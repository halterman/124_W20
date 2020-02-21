import java.util.Scanner;

public class Quiz06a {
	public static void main(String[] args) {
		int input, result = 100;
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		while (input >= 0) {
			result -= input;
			input = scan.nextInt();
		}
		System.out.println(result);
	}
}