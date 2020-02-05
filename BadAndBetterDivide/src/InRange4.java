// A better version of InRange3.java.
import java.util.Scanner;

public class InRange4 {

    public static void main(String[] args) {
        System.out.print("Please enter a number in the range 1...10: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <= 10 && num >= 1) { 
            System.out.println("You entered " + num);
        } else {
            System.out.println("The number is out of range");
        }
    }

}
