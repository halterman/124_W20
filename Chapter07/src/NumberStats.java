
public class NumberStats {
	
	/**
	 * Counts the number of even elements in array {@code a} 
	 * @param a the array to process
	 * @param count a {@code Counter} object that handles the counting
	 */
	private static void talleyEvens(int[] a, Counter count) {
		for (int elem : a) {
			if (elem % 2 == 0) {
				count.increment();
			}
		}
	}
	
	/**
	 * Counts the number of elements in array {@code a} that are 
	 * larger than 100
	 * @param a the array to process
	 * @param count a {@code Counter} object that handles the counting
	 */
	private static void talleyLarge(int[] a, Counter count) {
		for (int elem : a) {
			if (elem > 100) {
				count.increment();
			}
		}
	}

	public static void main(String[] args) {
		int[] myList = {10, 9, 14, 105, 88, 612, 4, 900, 777};

		Counter evenCounter = new Counter();
		talleyEvens(myList, evenCounter);
		System.out.println("Number of even numbers: " + evenCounter.get());

		Counter largeCounter = new Counter();
		talleyLarge(myList, largeCounter);
		System.out.println("Number of large numbers: " + largeCounter.get());
		
		System.out.println("Even counter before reset: " + evenCounter.get());
		evenCounter.reset();
		System.out.println("Even counter after reset: " + evenCounter.get());

		System.out.println("Large counter before reset: " + largeCounter.get());
		largeCounter.reset();
		System.out.println("Large counter after reset: " + largeCounter.get());
	}

}
