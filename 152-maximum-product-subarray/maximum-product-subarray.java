class Solution {
    public int maxProduct(int[] nums) 
    {
        //well will take a prefix product (similar to prefix sum)
        // and a suffix product (similar to suffix sum)
        // and when 0 occurs set product = 1
        //This is using kadane's algo from fron and back and storing th max out of both

        int maxi=Integer.MIN_VALUE; int pre=1,suff=1;

        int prod=1;

        for(int i=0;i<nums.length;i++)
        {
          prod*=nums[i];
          maxi=Math.max(prod,maxi);
          if(prod==0)
           prod=1;
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--)
        {
          prod*=nums[i];

          maxi=Math.max(prod,maxi);
          if(prod==0)
           prod=1;
        }
        return maxi;
    }
}