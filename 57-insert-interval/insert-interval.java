class Solution {
    public int[][] insert(int[][] arr1, int[] newn) 
    {
        int n=arr1.length;

        int[][] arr = Arrays.copyOf(arr1, n + 1);
        arr[n] = newn;
        
        Arrays.sort(arr, (a,b)->Integer.compare(a[0],b[0]));
        int ans[][] =new int[n+1][2];
        int k=0;
        for(int i=0;i<n+1;i++)
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