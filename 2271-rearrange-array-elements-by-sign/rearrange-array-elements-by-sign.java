class Solution {
    public int[] rearrangeArray(int[] nums)
    {
        // since equal number of + and - numbers so we can do in TC- O(N) & SC - O(N) of doing in TC of O(2N)
        int arr1[]=new int[nums.length];
        int pos=0,neg=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {arr1[pos]=nums[i];pos+=2;}
            else
            {arr1[neg]=nums[i];neg+=2;}
        }

        return arr1;
    }
}