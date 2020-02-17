
public class TimesTable1 {

	public static void main(String[] args) {
		var scan = new java.util.Scanner(System.in);
		System.out.print("Enter size of table: ");
		int size = scan.nextInt();
		scan.close();
		
		for (int row = 1; row <= size; row++) {
			System.out.println("row #" + row);
		}

	}

}
