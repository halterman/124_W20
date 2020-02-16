
public class StarGridForLoop {

	public static void main(String[] args) {
		int width, height;
		var scan = new java.util.Scanner(System.in);
		System.out.print("Please enter width and height: ");
		width = scan.nextInt();
		height = scan.nextInt();
		for (int row = 0; row < height; row++) {
			for (int column = 0; column < width; column++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		scan.close();
	}

}
