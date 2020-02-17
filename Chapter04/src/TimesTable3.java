
public class TimesTable3 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		System.out.print("Enter size of table: ");
		int size = scan.nextInt();
		scan.close();
		
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				System.out.printf("%4d", row * column);
			}
			System.out.println();
		}

	}

}
