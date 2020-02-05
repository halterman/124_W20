// Determines if a number is in range or out of range,
// but the logic is bit complex.  See InRange4.java.
import java.util.Scanner;

public class InRange3 {

    public static void main(String[] args) {
        System.out.print("Please enter a number in the range 1...10: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <= 10) {
            if (num >= 1) {
                System.out.println("You entered " + num);
            } else {
                System.out.println("The number is out of range");
            }
        } else {
            System.out.println("The number is out of range");
        }
    }

}
