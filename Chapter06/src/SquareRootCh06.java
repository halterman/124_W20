
public class SquareRootCh06 {

	public static void main(String[] args) {
		
		System.out.println("Using the MyMath.sqrt method");
		for (double i = 1.0; i < 10.0; i += 0.5) {
			System.out.println(MyMath.sqrt(i) + " " + Math.sqrt(i));
		}

	}

}
