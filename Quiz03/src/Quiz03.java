import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
//        int x = 16;
//        System.out.println(x);     // 6.
//        System.out.println("x");   // 7.
//        System.out.println(x * 3); // 8.
//        System.out.println(x / 3); // 9.
//        System.out.println(x % 3); // 10.
        
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println(num1/num2);
        System.out.println("Program finished");
    }
}
