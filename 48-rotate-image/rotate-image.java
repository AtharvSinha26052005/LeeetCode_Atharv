class Solution {
    public void rotate(int[][] matrix) 
    {
        int n=matrix.length; int m=matrix[0].length;
        int matrix1[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix1[j][n-1-i]=matrix[i][j];
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=matrix1[i][j];
            }
        }
        
    }
}