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
		for(int i=2; i <= n ; i++)
		{
			for(int j=1; j <= x ; j++)
			{
				for(int k=1 ; k <=m  && k <= j ; k++)
				{
					arr[i][j] += arr[i-1][j-k];
				}
			}
		}
		
		return arr[n][x];
	}
	
	/**
	 * It initializes the passed array by filling all the columns of the first row(with index 1) with 1.
	 * 
	 */
	void intialize(long[][] arr,int n,int x)
	{
		for(int j=1;j <= x; j++)
		{
			arr[1][j] = 1;
		}
		return;
	}
	
}