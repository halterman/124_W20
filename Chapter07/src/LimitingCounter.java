
/**
 * A foolproof counting object
 */
public class LimitingCounter {
	private int count;
	private final int limit;
	
	/**
	 * Creates a counter object and
	 * initializes so it ready to begin
	 * counting
	 * @param limit specifies the maximum value
	 *        this counter can attain
	 */
	public LimitingCounter(int limit) {
		count = 0;
		this.limit = limit;
	}
	
	/**
	 * Increments the counter by one
	 */
	public void increment() {
		if (count < limit) {
			count++;
		}
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
	
	public String toString() {
		return Integer.toString(count);
	}

}
