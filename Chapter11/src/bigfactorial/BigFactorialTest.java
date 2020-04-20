package bigfactorial;

import java.math.BigInteger;

public class BigFactorialTest {
	
	public static BigInteger factorial(int n) {
		if (n < 2) {
			return BigInteger.ONE;
		} else {
			return factorial(n - 1).multiply(BigInteger.valueOf(n));
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 35; i++) {
			System.out.printf("%3d! = %,50d%n", i, factorial(i));
		}

	}

}
