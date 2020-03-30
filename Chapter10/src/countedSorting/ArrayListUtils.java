package countedSorting;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListUtils {

	private static Random rand = new Random();

	/**
	 * Returns a new ArrayList of size {@code size} filled with elements
	 * in the range 0...{@code limit} - 1
	 * @param size the number of elements in the randomly-filled ArrayList
	 * @param limit the upper bound on the value of each element; 
	 *        each element is randomly generated in the range 0...{@code limit} - 1
	 * @return a new ArrayList of size {@code size} filled with elements
	 *         in the range 0...{@code limit} - 1
	 */
	public static ArrayList<Integer> makeArrayList(int size, int limit ) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			result.add(rand.nextInt(limit));
		}
		return result;
	}
	
	/**
	 * Rearranges the elements of array {@code a} so they
	 * appear in ascending order 
	 * @param a the array to sort
	 */
	public static void selectionSort(ArrayList<Integer> a, Counter cntr) {
		int n = a.size();
		for (int i = 0; i < n - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (a.get(j) < a.get(smallest)) {
					smallest = j;
				}
			}
			if (i != smallest) {
				int temp = a.get(smallest);
				a.set(smallest, a.get(i));
				a.set(i, temp);
				cntr.increment();
			}
		}
	}
}
