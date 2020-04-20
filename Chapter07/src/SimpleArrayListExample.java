import java.util.ArrayList;

public class SimpleArrayListExample {

	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.add(50);
		System.out.println(list);
		list.add(1, 100);
		System.out.println(list);
		list.set(3, 200);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}

}
