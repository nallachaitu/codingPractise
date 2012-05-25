//It computes the minimum cost for cutting a log where the cost of cutting is proportional to its length.
//The method uses memoization technique by storing the results which may be used ahead.
public class dpLog
{
	int[] arr={0,1,1,1,1,1,1};
	int len = arr.length;
	int[][] compute = new int[len+1][len+1];
	int computeMinPrice(int start,int end)
	{
		if(start >= end )
			return 0;
		if(end == start+1)
			return 1;
		else if(compute[start][end] != 0)
		{
			return compute[start][end];
		}
		else
		{
			int min = Integer.MAX_VALUE;
			int cutPoint =0;
			for(int i=start+1;i<end;i++)
			{
				int result = computeMinPrice(start,i) + computeMinPrice(i+1,end) + end-start;
				if(result < min )
				{
					min = result;
					cutPoint = i;
				}
			}
			compute[start][end] = min;
			System.out.println("The cut point from  " + start + "  to  " + end + "  is  " +  cutPoint);
			return min;
		}
	}
	public static void main(String args[])
	{
		dpLog Log = new dpLog();
		int result = Log.computeMinPrice(0, Log.arr.length);
		System.out.println("Result : "+ result);
	}
	
}
