import java.util.Scanner;

public class BadAndBetterDivide {

    public static void main(String[] args) {
        System.out.print("Please enter two numbers to divide: ");
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if (num2 != 0) {
            int answer = num1 / num2;
            System.out.println(num1 + "/" + num2 + " = " + answer);
        } else {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program finished");
    }

}
