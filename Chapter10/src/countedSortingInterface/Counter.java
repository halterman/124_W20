package countedSortingInterface;
/**
 * A foolproof counting object
 */
public class Counter implements CounterType {
	protected int count;
	
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
	@Override
	public void increment() {
		count++;
	}
	
	/**
	 * Reveal the current count
	 * @return the counter's current value
	 */
	@Override
	public int get() {
		return count;
	}
	
	/**
	 * Resets the counter to zero
	 */
	@Override
	public void reset() {
		count = 0;
	}

}
