// Team_Legendary_Waddlers -- Leo Au-Yeung, Elias Milborn, James Wang

/*======================================
  class MergeSortTester
  ALGORITHM:
  Divide an array of length n into n sub-arrays of length 1. Repeatedly merge these
  sub-arrays to create larger, sorted sub-arrays until one array remains.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  nlog(n)

  Mean execution times for dataset of size n:
  Batch size: 10000
  n=1       time: 145 nanoseconds
  n=10      time: 1182 nanoseconds
  n=100     time: 8547 nanoseconds

  ...
  n=10000  time: 953329 nanoseconds
  ANALYSIS:
  As the array grows larger, more time
 is required to sort it.
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
	
	//Method to sort arrays and time them
    	public static void test(int len) {
        //Create a new array test with input length & populate it
        int[][] test = new int[10000][len];
        //We created a 2d array instead to just go through all 100 rows of the 1d array of specified length
        populate(test);

	//Tracking the time when process began
        long timeStart = System.nanoTime();
        for (int i = 0; i < test.length; i++) {

            //Sorting the array
            MergeSort.sort(test[i]);

	}
        //Tracking the time when process ended
        long timeEnd = System.nanoTime();

        //Tracking the average time for all 10000 runs
        long time = (timeEnd - timeStart)/10000;

        //After running all 100, find average time of all the runs
        //averageTime = averageTime / 10000;
        System.out.println("Average runtime for array of size " + len + ": " + time + " nanoseconds");
    }

    /******************************
     * execution time analysis:
     * 100 times, randomly populate an array and record the time it takes to sort it.
     * The average time is found by dividing the total time taken by 100
     ******************************/
    public static void main(String[] args) {
	System.out.println("Testing arrays 10000 times each...");
        //Testing arrays of size 1
        test(10000);
        //Testing arrays of size 10
        test(1000);
        //Testing arrays of size 100
        test(100);
	//Testing arrays of size 1000
	test(10);
        //Testing arrays of size 10000
        test(1);
	System.out.println();
    }//end main

}//end class
