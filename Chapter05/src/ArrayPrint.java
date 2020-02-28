import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		var rand = new java.util.Random();
		int[] numberList = new int[rand.nextInt(21)];
		
		for (int i = 0; i < numberList.length; i++) {
			numberList[i] = rand.nextInt(100);
		}
		
		System.out.print("[ ");
		for (int i = 0; i < numberList.length; i++) {
			System.out.print(numberList[i] + " ");
		}
		System.out.println("]");
		
		System.out.println("---------------------------");
		
		// This will not help out the contents of the array
		// in a helpful manner
//		System.out.println(numberList);
		System.out.println(Arrays.toString(numberList));
	}

}
