
public class PreAndPostIncrement {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		
		System.out.print("Postincrement: ");
		x1 = 3;
		y1 = x1++;
		System.out.println("x1 = " + x1 + ", y1 = " + y1);
		
		System.out.println("-------------------------");

		System.out.print("Preincrement: ");
		x2 = 3;
		y2 = ++x2;
		System.out.println("x2 = " + x2 + ", y2 = " + y2);
	}

}
