/*
 * This is non optimized version of space .
 *
*/

#include<stdio.h>
int output1 = 0;
void extract(char *str,int arr[][4],int size);

void printArr(int A[4][4])
{
	printf("\n");
	int i=0,j=0;
	for(;i<4;i++)
	
	{
		for(;j<4;j++)
		{
			printf("%d\t",A[i][j]);
		
		}
	printf("\n");
	
	}
	printf("\n");

}
int maxAmount(int size,char *str)
{
	if(size < 1) return 0;
	int A[size][size];
	extract(str,A,size); // extract the array of integers from the passed string 
	if(size == 1) return A[0][0];
	int i=size-2, j,k;
	int max=0,right=0,down=0;
	for(;i >= 0;i--)
	{
		for(k=i,j=size-1;k<size;k++,j--)
		{
			right = (j+1 < size) ? A[k][j+1]: 0;
			down = (k+1 < size) ? A[k+1][j]: 0;
			if(down > right )
				max = down;
			else 
				max = right;
			
			A[k][j] += max;
 			
		}
	}
	j = size - 2;
	for(;j >= 0 ;j--)
		for(k=j,i=0;k>=0; k--,i++)
		{
			right = (j+1 < size) ? A[k][j+1]: 0;
			down = (k+1 < size) ? A[k+1][j]: 0; 
			if(down > right)
				max = down;
			else
				max = right;
				
			A[i][k] += max;
		}
	printArr(A);
	return A[1][0];

}

void extract(char *str,int arr[][4],int size)
{
	int i,j,k=1;
	for(i=0;i < size;i++,k+=2)
		for(j=0;j<size;j++,k +=2)
		{
			
			arr[i][j] = (int)(str[k] - '0');
		}

}


int main()
{
	output1 = maxAmount(4,"(1,7,5,2),(5,12,3,6),(100,9,23,16),(16,4,5,9)");
	printf("Maximum Amount %d",output1);

}







