class Solution {
    public static void swap(int arr[][],int i,int j)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public void rotate(int[][] matrix) 
    {
        int n=matrix.length; //int m=matrix[0].length;
        //int matrix1[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=matrix[i][j];matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        
        
    }
}