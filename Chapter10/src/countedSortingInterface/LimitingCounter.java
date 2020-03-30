package countedSortingInterface;

/**
 * A foolproof counting object
 */
public class LimitingCounter extends Counter {
	private final int limit;
	
	/**
	 * Creates a counter object and
	 * initializes so it ready to begin
	 * counting
	 * @param limit specifies the maximum value
	 *        this counter can attain
	 */
	public LimitingCounter(int limit) {
		this.limit = limit;
	}
	
	/**
	 * Increments the counter by one
	 */
	@Override
	public void increment() {
		if (count < limit) {
			count++;
		}
	}
	
	/**
	 * Returns a string representation for this counter
	 */
	@Override
	public String toString() {
		return Integer.toString(count);
	}

}

