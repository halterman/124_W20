package enhancedcounter;

/**
 * A foolproof counting object
 */
public class EnhancedCounter {
	/** The value of next serial number ID */
	private static int serialNumberSource = 0;
	
	/** The counter's serial number ID */
	private int id;

	/** The counter's current value */
	private int count;
	
	/** The maximum value the counter can attain */
	private final int limit;
	
	/** The total items counted among all counter objects */
	private static int globalCount = 0;

	
	/**
	 * Creates a counter object and
	 * initializes so it ready to begin
	 * counting
	 * @param limit specifies the maximum value
	 *        this counter can attain
	 */
	public EnhancedCounter(int limit) {
		id = serialNumberSource++;
		count = 0;
		this.limit = limit;
	}
	
	/**
	 * Increments the counter by one
	 */
	public void increment() {
		if (count < limit) {
			count++;
			globalCount++;
		}
	}
	
	/**
	 * Reveals the current count
	 * @return the counter's current value
	 */
	public int get() {
		return count;
	}
	
	/**
	 * Reveals the counter's unique serial number ID
	 * @return the counter's serial number ID
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Reveals the global count value for all the existing
	 * counter objects in the program
	 * @return the current global count value
	 */
	public static int getGlobal() {
		return globalCount;
	}
	
	/**
	 * Resets the counter to zero
	 */
	public void reset() {
		// Take away from the global shared counter this counter's counts
		globalCount -= count; 
		// Reset this counter's value
		count = 0;
	}
	
	/**
	 * Returns a string representation for this counter
	 */
	public String toString() {
		return Integer.toString(count);
	}

}
