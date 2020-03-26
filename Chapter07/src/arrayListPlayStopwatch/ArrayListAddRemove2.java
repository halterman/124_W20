package arrayListPlayStopwatch;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddRemove2 {
   public static void main(String[] args) {
      var scnr = new Scanner(System.in);
      var myInts = new ArrayList<Integer>(); // Dummy array list to demo ops
      int numElem;                                          // User defined array size
      int numOps;                                           // User defined number of inserts

      Stopwatch timer = new Stopwatch();
      
      System.out.print("\nEnter initial ArrayList size: ");
      numElem = scnr.nextInt();

      System.out.print("Enter number of ArrayList adds: ");
      numOps = scnr.nextInt();

      System.out.print("  Adding elements to ArrayList...");

      myInts.clear();

      timer.start();
      for (int i = 0; i < numElem; ++i) {
         myInts.add(0);
      }
      timer.stop();
      System.out.println("done. Elapsed = " + timer.elapsed() + " sec");
      timer.reset();

      System.out.print("  Writing to each element...");
      timer.start();
      for (int i = 0; i < numElem; ++i) {
         myInts.set(i, 777); // Any value
      }
      timer.stop();
      System.out.println("done. Elapsed = " + timer.elapsed() + " sec");
      timer.reset();

      System.out.print("  Doing " + numOps + " additions at the end...");
      timer.start();
      for (int i = 0; i < numOps; ++i) {
         myInts.add(888); // Any value
      }
      timer.stop();
      System.out.println("done. Elapsed = " + timer.elapsed() + " sec");
      timer.reset();

      System.out.print("  Doing " + numOps + " additions at index 0...");
      timer.start();
      for (int i = 0; i < numOps; ++i) {
         myInts.add(0, 444);
      }
      timer.stop();
      System.out.println("done. Elapsed = " + timer.elapsed() + " sec");
      timer.reset();
      
      System.out.print("  Doing " + numOps + " removes...");
      timer.start();
      for (int i = 0; i < numOps; ++i) {
         myInts.remove(0);
      }
      timer.stop();
      System.out.println("done. Elapsed = " + timer.elapsed() + " sec");
      timer.reset();
   }
}
