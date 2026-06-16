class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) 
    {
        int n=a.length;
        int m=b.length;

        int ans[][] = new int[n+m][2];

        if(m==0 || n==0) return new int[0][0];
       
        int k=0,i=0,j=0;
        while(i<n && j<m)
        {
            //1st case
            if(a[i][0]<=b[j][0])
            {
                //overlapping case
                if(a[i][1]>=b[j][0])
                {
                    ans[k][0]=Math.max(a[i][0],b[j][0]);
                    ans[k][1]=Math.min(a[i][1],b[j][1]);
                    k++;
                }

            }
            else
            {
                //overlapping case
                if(b[j][1]>=a[i][0])
                {
                    ans[k][0]=Math.max(a[i][0],b[j][0]);
                    ans[k][1]=Math.min(a[i][1],b[j][1]);
                    k++;
                }
            }

            if(a[i][1]<b[j][1]) i++;
            else j++;
        }

        return Arrays.copyOf(ans,k);


    }
}