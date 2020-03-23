import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] list = ArrayUtils.makeArray(20, 1_000);
		System.out.println(Arrays.toString(list));
		
		ArrayUtils.selectionSort(list);
		System.out.println(Arrays.toString(list));
		
	}

}
