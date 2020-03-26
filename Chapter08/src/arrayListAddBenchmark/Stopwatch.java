package arrayListAddBenchmark;

public class Stopwatch {
	/** Timestamp when the stopwatch began running */
	private long startTime;

	/** Timestamp when the stopwatch stopped running */
	private long stopTime;

	/** 
	 * The accumulated time; the sum of the start/stop intervals
	 * since the latest stopwatch reset.
	 */
	private long elapsedTime;

	/** Indicates whether the stopwatch is running or stopped */
	private boolean running;
	
	/**
	 * Creates a stopwatch ready to start running:
	 * <ul>
	 *   <li>The stopwatch initially is not running</li>
	 *   <li>The stopwatch's start and stop times initially are zero</li>
	 * </ul>
	 */
	public Stopwatch() {
		reset();
	}
	
	/**
	 * Starts the stopwatch, unless it already is running.
	 * Has no effect on a running stopwatch.
	 */
	public void start() {
		if (!running) {
			running = true;
			startTime = System.currentTimeMillis();
		}
	}
	
	/**
	 * Stops the running stopwatch.
	 * Computes the time elapsed since the stopwatch most
	 * recently began running plus any time already accumulated
	 * since the stopwatch has been reset.
	 * Has no effect on a stopwatch not running.
	 */
	public void stop() {
		if (running) {
			stopTime = System.currentTimeMillis();
			elapsedTime += stopTime - startTime;
			running = false;
		}
	}
	
	/**
	 * Returns the number of seconds elapsed between the 
	 * stopwatch's starting and stopping times, less any time
	 * when the stopwatch was not running.
	 * If the stopwatch currently is running (and thus not stopped),
	 * it returns the time since the stopwatch started running 
	 * plus any time accumulated since the latest reset.
	 * @return the cumulative running time since the latest reset.
	 */
	public double elapsed() {
		if (running) {
			return (System.currentTimeMillis() - startTime + elapsedTime)/1000.0;
		} else {
			return elapsedTime/1000.0;
		}
	}
	
	/**
	 * Resets a stopwatch to its initial state:
	 * not running, with no time recorded.
	 */
	public void reset() {
		running = false;
		startTime = stopTime = elapsedTime = 0;
	}

}
