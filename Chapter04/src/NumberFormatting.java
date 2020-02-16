
public class NumberFormatting {

	public static void main(String[] args) {
		var rand = new java.util.Random();
		for (int number = 1; number < 100_000_000; number *= 10) {
			System.out.println(number);
		}
		System.out.println("--------------------------");
		for (int number = 1; number < 100_000_000; number *= 10) {
			System.out.printf("%10d%n", number);
		}
		System.out.println("--------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%,17.3f%n", 100_000_000*rand.nextDouble());
		}


	}

}
