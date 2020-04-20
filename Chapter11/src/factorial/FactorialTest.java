package factorial;

public class FactorialTest {
	
	public static long factorial(int n) {
		if (n < 2) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 25; i++) {
			System.out.printf("%3d! = %,30d%n", i, factorial(i));
		}

	}

}
