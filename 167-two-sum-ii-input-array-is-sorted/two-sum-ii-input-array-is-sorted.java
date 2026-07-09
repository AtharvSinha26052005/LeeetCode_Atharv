class Solution {
    public int[] twoSum(int[] a, int t) 
    {
        int n=a.length;
        int l=0,r=n-1;

        int sum=Integer.MIN_VALUE;

        while(l<r)
        {
            sum=a[l]+a[r];
            if(sum==t)
            return new int[]{l+1,r+1};

            if(sum<t) l++;
            else r--;
        }

        return new int[]{};
        
    }
}