import java.util.Scanner;

public class MilesFeetInchesToInches {

    public static void main(String[] args) {
        // Define some useful conversion factors
        final int INCHES_PER_FOOT = 12;
        final int INCHES_PER_MILE = INCHES_PER_FOOT * 5280;
        
        // Get input from the user
        System.out.println("Please enter miles, feet, and inches");
        Scanner scan = new Scanner(System.in);
        int miles, feet, inches;
        miles = scan.nextInt();
        feet = scan.nextInt();
        inches = scan.nextInt();
        
        // Convert to total number of inches
        int totalInches = miles * INCHES_PER_MILE + feet * INCHES_PER_FOOT + inches;
        
        // Report the result
        System.out.println("The total inches are " + totalInches);
        scan.close();
    }

}
