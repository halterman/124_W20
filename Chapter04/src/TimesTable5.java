
public class TimesTable5 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		System.out.print("Enter size of table: ");
		int size = scan.nextInt();
		scan.close();
		
		System.out.print("  x  ");
		// Print the column labels
		for (int column = 1; column <= size; column++) {
			System.out.printf("%4d", column);
		}
		System.out.println();
		System.out.print("    +");
		for (int column = 1; column <= size; column++) {
			System.out.print("----");
		}
		System.out.println();
		
		
		// Print the contents of the table
		for (int row = 1; row <= size; row++) {
			System.out.printf("%3d |", row);
			for (int column = 1; column <= size; column++) {
				System.out.printf("%4d", row * column);
			}
			System.out.println();
		}

	}

}
