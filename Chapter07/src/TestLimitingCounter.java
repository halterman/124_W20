
public class TestLimitingCounter {

	public static void main(String[] args) {
		LimitingCounter c = new LimitingCounter(10);
		System.out.println("Initially, c is " + c);
		for (int i = 0; i < 20; i++) {
			c.increment();
			System.out.println(c);
		}
		System.out.println("Finally, c is " + c);
		c.reset();
		System.out.println("After reset, c is " + c);

	}

}
