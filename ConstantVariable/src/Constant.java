import java.util.Scanner;

public class Constant {

    public static void main(String[] args) {
        final double PI = 3.1416;
        double radius;
        double circum;
        
        System.out.println("Please enter the radius: ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();
        
        circum = 2 * PI * radius;
        
        System.out.println("The circumference is " + circum);

    }

}
