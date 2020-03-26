package arrayListPlay;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		System.out.print("Please enter numbers, negative quits: ");
		var scan = new java.util.Scanner(System.in);
		int input = scan.nextInt();
		while (input >= 0) {
			list.add(input);
			input = scan.nextInt();
		}
		scan.close();
		for (int elem : list) {
			System.out.print(elem + " ");
		}
		System.out.println();
		System.out.println("----------------");
		System.out.println(list);
	}

}
