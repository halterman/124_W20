package arrayListAddBenchmark;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAddBenchmark {
   public static void main(String[] args) {
      var scan = new Scanner(System.in);
      var myInts = new ArrayList<Integer>(); // Dummy array list to demo ops
      int numElems;                          // User defined array size

      Stopwatch timer = new Stopwatch();
      
      System.out.print("Enter ArrayList size: ");
      numElems = scan.nextInt();
      scan.close();

      // ------ Add to back of array list ---------------------
      System.out.printf("ArrayList size = %,d%n", myInts.size());
      System.out.printf("    Adding %,d elements to the end:     ", numElems);
      timer.start();
      for (int i = 0; i < numElems; ++i) {
         myInts.add(5);  // Add each element to the back of the array list
      }
      timer.stop();
      System.out.printf("%8.3f sec to add to back%n", timer.elapsed());
      timer.reset();
      System.out.printf("ArrayList size = %,d%n", myInts.size());

      // ------ Remove from back of array list ---------------------
      System.out.printf("  Removing %,d elements from the end:   ", numElems);
      timer.start();
      for (int i = 0; i < numElems; ++i) {
         myInts.remove(myInts.size() - 1); // Remove last element each time
      }
      timer.stop();
      System.out.printf("%8.3f sec to remove from back%n", timer.elapsed());
      timer.reset();
      System.out.printf("ArrayList size = %,d%n", myInts.size());


      // ------ Add to front of array list ---------------------
      System.out.printf("    Adding %,d elements to the front:   ", numElems);
      timer.start();
      for (int i = 0; i < numElems; ++i) {
         myInts.add(0, 7);   // Add each element to the front of the array list 
      }
      timer.stop();
      System.out.printf("%8.3f sec to add to front%n", timer.elapsed());
      timer.reset();
      System.out.printf("ArrayList size = %,d%n", myInts.size());
      
      // ------ Remove from back of array list ---------------------
      System.out.printf("  Removing %,d elements from the front: ", numElems);
      timer.start();
      for (int i = 0; i < numElems; ++i) {
         myInts.remove(0);  // Remove each element from the front of the array list
      }
      timer.stop();
      System.out.printf("%8.3f sec to remove from front%n", timer.elapsed());
      timer.reset();
      System.out.printf("ArrayList size = %,d%n", myInts.size());
   }
}
