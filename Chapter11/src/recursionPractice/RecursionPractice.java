package recursionPractice;

public class RecursionPractice {
	
	public static int f(int n) {
		if (n < 5) {
			return 2;
		} else {
			return 4 + f(n - 3) + f(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(f(9));
	}

}
