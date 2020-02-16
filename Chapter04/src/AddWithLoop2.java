
public class AddWithLoop2 {

	public static void main(String[] args) {
		int num, sum = 0;
		var scan = new java.util.Scanner(System.in);
		System.out.print("(V2) Please enter nonnegative integers (negative quits): ");
		num = scan.nextInt();
		while (num >= 0) {
			sum += num;
			num = scan.nextInt();
		}
		System.out.println("Sum = " + sum);
		scan.close();

	}

}
