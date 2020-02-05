import java.util.Scanner;

public class InRange2 {

    public static void main(String[] args) {
        System.out.print("Please enter a number in the range 1...10: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <= 10) {
            if (num >= 1) {
                System.out.println("You entered " + num);
            } else {
                System.out.println("The number is too small");
            }
        } else {
            System.out.println("The number is too big");
        }
    }

}
