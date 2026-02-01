package sorting;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        
         {
        int[] testInput = randomArray(100);  // Change to a bigger size like 100
        
        // Increase the loop count to get better results once it works.
        TestSuite.run(testInput, 1000);  // Change to 1000 or 10000
    }
        // Task:
        //
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.

        int[] testInput = randomArray(100);

        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        TestSuite.run(testInput, 10000);
    }

    public static int[] randomArray(int length)
    {
        int[] a = new int[length];
       Random random = new Random();
 
        for (int i = 0; i < length; i++) {
    a[i] = random.nextInt(1000);
          }

           return a;
           }

        }
