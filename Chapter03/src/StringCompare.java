import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
//		if (name == "Rick") {
		if (name.equals("Rick")) {
			System.out.println("Hey, I know you!");
		} else {
			System.out.println("Who?");
		}

	}

}
