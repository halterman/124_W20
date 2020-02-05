import java.util.Scanner;

public class NumberInRange {

    public static void main(String[] args) {
        System.out.print("Please enter an integer in the range 1...5: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) {
            System.out.println("one");
        } else {
            if (number == 2) {
                System.out.println("two");
            } else {
                if (number == 3) {
                    System.out.println("three");
                } else {
                    if (number == 4) {
                        System.out.println("four");
                    } else {
                        if (number == 5) {
                            System.out.println("five");
                        } else {
                            if (number < 1) {
                                System.out.println("Too small");
                            } else {
                                System.out.println("Too big");
                            }
                        }
                    }
                }
            }
        }
    }

}
