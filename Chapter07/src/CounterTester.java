
public class CounterTester {

	public static void main(String[] args) {

		Counter c = new Counter();
		System.out.println("Initial counter value: " + c.get());
		for (int i = 0; i < 100; i++) {
			c.increment();
			System.out.println("Current counter value: " + c.get());
		}
		System.out.println("Final counter value: " + c.get());
	}

}
