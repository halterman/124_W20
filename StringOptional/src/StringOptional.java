import java.util.Scanner;

public class StringOptional {

    public static void main(String[] args) {
        System.out.print("enter 0 or 1");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input == 0) {
            System.out.println("Zero");
        }
        System.out.println("Program finished");
    }

}
