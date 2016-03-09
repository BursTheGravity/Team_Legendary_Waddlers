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

public class MergeSortTester 
{
	public static void populate ( int[][] arr ) {
		for (int i = 0; i < arr.length; i++) {
			for ( int x = 0; x < arr[i].length; x++ ) {
				int ranNum = Math.random() * 10 + 1;
				arr[i][x] = ranNum;
			}
		}
	}
	
	public static void test ( int len ) {
		int[][] test = new int[100][len];
		populate(test);

		int time = System.currentTimeMillis();
		for (int[] a : test) {
			sort(a);
		}
		time = System.currentTimeMillis() - time;
		System.out.println("Time for size " + len + " : " + time);
	}
	

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	
    }//end main

}//end class
