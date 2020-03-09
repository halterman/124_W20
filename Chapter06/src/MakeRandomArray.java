import java.util.Arrays;
import java.util.Random;

public class MakeRandomArray {

	public static int[] makeArray(int size, int limit ) {
		Random rand = new Random();
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = rand.nextInt(limit);
		}
		return result;
	}
	
		
	public static void main(String[] args) {
		
		int[] list = makeArray(20, 100);
		System.out.println(Arrays.toString(list));

		list = makeArray(5, 1_000_000_000);
		System.out.println(Arrays.toString(list));
	}

}
