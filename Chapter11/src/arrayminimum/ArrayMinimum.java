package arrayminimum;

import java.util.Arrays;
import java.util.Random;

public class ArrayMinimum {
	
	private static Random rand = new Random();
	
	/**
	 * Makes an array of random integers
	 * @param size the number of integers in the array
	 * @param limit the elements range in values are
	 *        0...{@code limit} - 1
	 * @return an array of {@code size} random integers
	 *         ranging from 0 to {@code limit} - 1
	 */
	public static int[] makeArray(int size, int limit) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = rand.nextInt(limit);
		}
		return result;
	}
	
	/**
	 * Locates a minimum element in a array of integers.
	 * Throws an array index out of bounds exception if the
	 * array is empty.
	 * @param a the array
	 * @return a minimum value in the array
	 */
	public static int findMinimum(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	
	/**
	 * Locates a minimum element in a array of integers,
	 * with the search starting at index {@code start}.
	 * Throws an array index out of bounds exception if the
	 * array is empty.
	 * @param a the array
	 * @param start the starting index where the search should begin
	 * @return a minimum value in the array
	 */
	private static int findMin(int[] a, int start) {
		if (start == a.length - 1) {
			return a[start];
		} else {
			return Math.min(a[start], findMin(a, start + 1));
		}
	}
	
	/**
	 * Locates a minimum element in a array of integers.
	 * Throws an array index out of bounds exception if the
	 * array is empty.
	 * @param a the array
	 * @return a minimum value in the array
	 */
	public static int findMinimumRec(int[] a) {
		return findMin(a, 0);
	}
	
	
	public static void main(String[] args) {
		int[] a = makeArray(20, 100);
		System.out.println(Arrays.toString(a) + " with minimum " + findMinimum(a));
		System.out.println(Arrays.toString(a) + " with minimum " + findMinimumRec(a));
		
	}

}