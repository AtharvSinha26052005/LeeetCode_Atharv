class Solution {
    public int[][] merge(int[][] arr) 
    {
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));

        int n=arr.length;
        int ans[][] =new int[n][2];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(k==0)
            ans[k++] = arr[i];
            else if(arr[i][0] > ans[k-1][1])
            ans[k++] = arr[i];
            else
            {
                ans[k-1][1]=Math.max(ans[k-1][1],arr[i][1]);
            }
        }

        return Arrays.copyOf(ans,k);
    }
}