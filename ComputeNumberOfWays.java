/**
	Problem: Given n numbers of dice with m number of faces where each face can have a value from 1 to m,
	compute the number of ways possible for the sum of all the dice to a value x
	m - no of faces
	n - no of dice
	x - given value
*/

public ComputeNumberOfWays
{
	/**
	 * Main function for computing the number of possible ways of throwing dice which 
	 * would sum upto x.
	 */
	long computeWays(int m, int n, int x)
	{
		// using one additional row and column to start the numbering from 1
		long[][] arr = new long[n+1][x+1];
		
		/**
		 * since the number of ways for throwing dice given only dice is always one irrespective of the value. 
		 */
		intialize(arr,n,x);
	}
	
	/**
	 * It initializes the passed array by filling all the columns of the first row(with index 1) with 1.
	 * 
	 */
	void intialize(long[][] arr,int n,int x)
	{
		
	}
	
}