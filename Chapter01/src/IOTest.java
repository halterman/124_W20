import java.util.Scanner;

public class IOTest {

    public static void main(String[] args) {
        // Request a number from the user
        System.out.println("Please enter a number: ");
        int x;
//        x = 10;
//        System.out.println("x = " + x);
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.println("You entered " + x);

    }

}
