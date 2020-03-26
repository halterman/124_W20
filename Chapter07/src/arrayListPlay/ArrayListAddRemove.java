package arrayListPlay;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddRemove {
   public static void main(String[] args) {
      var scnr = new Scanner(System.in);
      var myInts = new ArrayList<Integer>(); // Dummy array list to demo ops
      int numElem;                                          // User defined array size
      int numOps;                                           // User defined number of inserts

      System.out.print("\nEnter initial ArrayList size: ");
      numElem = scnr.nextInt();

      System.out.print("Enter number of ArrayList adds: ");
      numOps = scnr.nextInt();

      System.out.print("  Adding elements to ArrayList...");

      myInts.clear();

      long startTime = System.currentTimeMillis();
      for (int i = 0; i < numElem; ++i) {
         myInts.add(0);
      }
      long stopTime = System.currentTimeMillis();
      System.out.println("done. Elapsed = " + (stopTime - startTime));

      System.out.print("  Writing to each element...");
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numElem; ++i) {
         myInts.set(i, 777); // Any value
      }
      stopTime = System.currentTimeMillis();
      System.out.println("done. Elapsed = " + (stopTime - startTime));

      System.out.print("  Doing " + numOps + " additions at the end...");
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numOps; ++i) {
         myInts.add(888); // Any value
      }
      stopTime = System.currentTimeMillis();
      System.out.println("done. Elapsed = " + (stopTime - startTime));

      System.out.print("  Doing " + numOps + " additions at index 0...");
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numOps; ++i) {
         myInts.add(0, 444);
      }
      stopTime = System.currentTimeMillis();
      System.out.println("done. Elapsed = " + (stopTime - startTime));
      
      System.out.print("  Doing " + numOps + " removes...");
      startTime = System.currentTimeMillis();
      for (int i = 0; i < numOps; ++i) {
         myInts.remove(0);
      }
      stopTime = System.currentTimeMillis();
      System.out.println("done. Elapsed = " + (stopTime - startTime));
   }
}
