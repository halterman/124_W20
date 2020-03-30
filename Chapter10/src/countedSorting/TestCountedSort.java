package countedSorting;

import java.util.ArrayList;

public class TestCountedSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = ArrayListUtils.makeArrayList(20, 100);
		LimitingCounter c = new LimitingCounter(100);
		
		System.out.println("Before: " + list);
		ArrayListUtils.selectionSort(list, c);
		System.out.println(" After: " + list);
		System.out.println("Number of swaps: " + c.get());
		System.out.println();
		c.reset();
		
		list.clear();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(60);
		System.out.println("Before: " + list);
		ArrayListUtils.selectionSort(list, c);
		System.out.println(" After: " + list);
		System.out.println("Number of swaps: " + c.get());
		System.out.println();
		c.reset();

		list.clear();
		list.add(60);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(20);
		list.add(10);
		System.out.println("Before: " + list);
		ArrayListUtils.selectionSort(list, c);
		System.out.println(" After: " + list);
		System.out.println("Number of swaps: " + c.get());
		System.out.println();

	}
	

}
