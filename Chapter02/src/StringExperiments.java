import java.util.Random;
import java.util.Scanner;

public class StringExperiments {

    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scan.nextLine();
        System.out.println("Pleased to meet you, " + name + "!");
        
        char symbol;
        symbol = scan.next().charAt(0);
        System.out.println("You entered " + symbol);
        
        System.out.println("------------");
        Random rand = new Random();
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));
        System.out.println(rand.nextInt(5));

    }

}
