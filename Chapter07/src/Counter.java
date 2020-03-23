
/**
 * A foolproof counting object
 */
public class Counter {
	private int count;
	
	/**
	 * Creates a counter object and
	 * initializes so it ready to begin
	 * counting
	 */
	public Counter() {
		count = 0;
	}
	
	/**
	 * Increments the counter by one
	 */
	public void increment() {
		count++;
	}
	
	/**
	 * Reveal the current count
	 * @return the counter's current value
	 */
	public int get() {
		return count;
	}
	
	/**
	 * Resets the counter to zero
	 */
	public void reset() {
		count = 0;
	}

}
