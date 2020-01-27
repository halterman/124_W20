import java.util.Scanner;

public class InchesToMilesFeetInches {

    public static void main(String[] args) {
        // Set up some conversion factors
        final int INCHES_PER_FOOT = 12;
        final int INCHES_PER_MILE = 5280 * INCHES_PER_FOOT;
        
        // Get the number of inches from the user
        System.out.println("Please enter the total number of inches");
        int total_inches;
        Scanner scnr = new Scanner(System.in);
        total_inches = scnr.nextInt();
        scnr.close();
        
        // Compute the miles, feet, and inches
        int miles, feet, inches;
        miles = total_inches/ INCHES_PER_MILE;     // Miles in total inches
        total_inches = total_inches % INCHES_PER_MILE;  // inches after removing the miles
        feet = total_inches / INCHES_PER_FOOT;  // Feet in the remaining inches
        inches = total_inches % INCHES_PER_FOOT; // Remaining inches after removing the feet
        
        // Report the results
        System.out.println("Miles: " + miles + "   Feet: " + feet + "  Inches: " + inches);

    }

}
