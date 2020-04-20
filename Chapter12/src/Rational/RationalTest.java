package Rational;

public class RationalTest {
	
	private static void testRational() {
		System.out.println("Start of testRational method");
		Rational myFract = new Rational(24, 36);
		System.out.println("myFract = " + myFract);
		System.out.println("End of testRational method");
		
	}

	public static void main(String[] args) {
		System.out.println("Start of main method");
		try {
		    testRational();
		} catch (IllegalArgumentException e) {
			System.out.println("Attempt to create illegal fraction");
		}
		System.out.println("End of main method");
	}

}
