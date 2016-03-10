// Team_Legendary_Waddlers -- Leo Au-Yeung, Elias Milborn, James Wang

/*======================================
  class MergeSortTester
  ALGORITHM:
  Divide an array of length n into n sub-arrays of length 1. Repeatedly merge these
  sub-arrays to create larger, sorted sub-arrays until one array remains.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  nlog(n)

  Mean execution times for dataset of size n:
  Batch size: 100
  n=1       time: 4104.62 nanoseconds
  n=10      time: 6900.38 nanoseconds
  n=100     time: 19423.34 nanoseconds

  ...
  n=10000  time: 1362575.14 nanoseconds
  ANALYSIS:
  As the array grows larger, more time is required to sort it.
======================================*/

public class MergeSortTester {

    //Method to populate array with ints from 0-9
    public static void populate(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for ( int x = 0; x < arr[i].length; x++ ) {
                int ranNum = (int) (Math.random() * 10);
                arr[i][x] = ranNum;
            }
        }
    }

    public static void test(int len) {
        double averageTime = 0;
        //Create a new array test with input length & populate it
        int[][] test = new int[100][len];
        //We created a 2d array instead to just go through all 100 rows of the 1d array of specified length
        populate(test);

        for (int i = 0; i < test.length; i++) {

            //Tracking the time when process began
            long timeStart = System.nanoTime();
            //Sorting the array
            MergeSort.sort(test[i]);
            //Tracking the time when process ended
            long timeEnd = System.nanoTime();
            //Taking difference of the two times for the actual time
            long time = timeEnd - timeStart;

            //Tracking the times of all 100 runs
            averageTime += (double) time;
        }

        //After running all 100, find average time of all the runs
        averageTime = averageTime / 100;
        System.out.println("Average runtime for array of size " + len + ": " + averageTime + " nanoseconds");
    }

    /******************************
     * execution time analysis:
     * 100 times, randomly populate an array and record the time it takes to sort it.
     * The average time is found by dividing the total time taken by 100
     ******************************/
    public static void main(String[] args) {
        //Testing arrays of size 1
        test(1);
        //Testing arrays of size 10
        test(10);
        //Testing arrays of size 100
        test(100);
        // Testing arrays of size 10000
        test(10000);
    }//end main

}//end class
