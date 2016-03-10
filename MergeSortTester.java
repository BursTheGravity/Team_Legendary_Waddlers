//Team_Legendary_Waddlers -- Leo Au-Yeung, Elias Milborn, James Wang

/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester {
	
	//Method to populate array with ints from 0-9
	public static void populate ( int[][] arr ) {
		for (int i = 0; i < arr.length; i++) {
			for ( int x = 0; x < arr[i].length; x++ ) {
				int ranNum = (int) ( Math.random() * 10 );
				arr[i][x] = ranNum;
			}
		}
	}
	
	public static void test ( int len ) {
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
			//Printing out the time
			System.out.println("Time for array of size " + len + " for run #" + (i + 1) + ": " + time + " nanoseconds");
			
			//Tracking the times of all 100 runs
			averageTime += (double) time;
		}
		
		//After running all 100, find average time of all the runs
		averageTime = averageTime / 100;
		System.out.println("Average runtime for array of size " + len + ": " + averageTime + " nanoseconds");
	}
	

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) {
		//Testing arrays of size 1
		test(1);
		//Testing arrays of size 10
		test(10);
		//Testing arrays of size 100
		test(100);
    }//end main

}//end class
