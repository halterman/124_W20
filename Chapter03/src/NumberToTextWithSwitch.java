// Converting number to text using the structure that most programmers use
import java.util.Scanner;

public class NumberToTextWithSwitch {

    public static void main(String[] args) {
        System.out.print("Enter an integer in the range 1...5: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
		switch (number) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				System.out.println("Other");
		}
	}

}
