package insertionSort;
import java.util.Random;

public class ArrayUtils {

	/**
	 * Returns a new array of size {@code size} filled with elements
	 * in the range 0...{@code limit} - 1
	 * @param size the number of elements in the randomly-filled array
	 * @param limit the upper bound on the value of each element; 
	 *        each element is randomly generated in the range 0...{@code limit} - 1
	 * @return a new array of size {@code size} filled with elements
	 *         in the range 0...{@code limit} - 1
	 */
	public static int[] makeArray(int size, int limit ) {
		Random rand = new Random();
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = rand.nextInt(limit);
		}
		return result;
	}
	
	/**
	 * Rearranges the elements of array {@code a} so they
	 * appear in ascending order 
	 * @param a the array to sort
	 */
	public static void selectionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			if (i != smallest) {
				int temp = a[smallest];
				a[smallest] = a[i];
				a[i] = temp;
			}
		}
	}
	
	/**
	 * Rearranges the elements of array {@code a} so they
	 * appear in ascending order 
	 * @param a the array to sort
	 */
	public static void differentSort(int[] a) {
		int n = a.length;
	    for (int i = 1; i < n; i++) {
	        int key = a[i]; 
	        int pos = i;
	        //  Shift larger values to the right
	        while (pos > 0 && a[pos - 1] > key) {
	            a[pos] = a[pos - 1];
	            pos--;
	        }
	        a[pos] = key;
	     }
	}
}
