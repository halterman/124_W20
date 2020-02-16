
public class AddWithLoop {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		var scan = new java.util.Scanner(System.in);
		System.out.print("Please enter nonnegative integers (negative quits): ");
		while (num >= 0) {
			num = scan.nextInt();
			if (num >= 0) {
				sum += num;
			}
		}
		System.out.println("Sum = " + sum);
		scan.close();

	}

}
