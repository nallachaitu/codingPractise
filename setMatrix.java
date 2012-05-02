public class setMatrix
{
	public void setMatrixwithZeroes(int[][] matrix)
	{
		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j] == 0)
				{
					rows[i] = true;
					cols[j] = true;
				}
				
			}
			
		}
		
		for(int i=0;i<rows.length;i++)
		{
			for(int j=0;j<cols.length;j++)
			{
				if(rows[i] == true || cols[j] == true)
					matrix[i][j] = 0;
				
			}
			
		}
		
		
	}
	public static void main(String[] args)
	{
		setMatrix testClass = new setMatrix();
		int[][] matrix = new int[3][3];
		//initialize matrix here
		testClass.setMatrixwithZeroes(matrix);
		//System.out.println(matrix[0][0]);
	}

}