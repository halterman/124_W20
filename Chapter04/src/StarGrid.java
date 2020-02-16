
public class StarGrid {

	public static void main(String[] args) {
		int width, height;
		var scan = new java.util.Scanner(System.in);
		System.out.print("Please enter width and height: ");
		width = scan.nextInt();
		height = scan.nextInt();
		int row = 0;
		while (row < height) {
			int column = 0;
			while (column < width) {
				System.out.print("* ");
				column++;
			}
			System.out.println();
			row++;
		}
		scan.close();
	}

}
