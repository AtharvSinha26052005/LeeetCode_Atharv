class Solution {
    public int maxProduct(int[] nums) 
    {
        //well will take a prefix product (similar to prefix sum)
        // and a suffix product (similar to suffix sum)
        // and when 0 occurs set product = 1

        int max=Integer.MIN_VALUE; int pre=1,suff=1;

        for(int i=0;i<nums.length;i++)
        {
            if (pre==0) pre=1; if(suff==0) suff=1;
            pre*=nums[i];
            suff*=nums[nums.length-1-i];
            max=Math.max(max,Math.max(pre,suff));
        }

        return max;
    }
}