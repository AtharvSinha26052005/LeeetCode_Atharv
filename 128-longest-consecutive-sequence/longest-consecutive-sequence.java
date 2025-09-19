class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length<=1) return nums.length;

        Arrays.sort(nums);
        int count=1;int start=nums[0];int max=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==start+1)
            {
                start=nums[i];count++; max=Math.max(max,count);
            }
            else if(nums[i]==start) continue;

            else
            {
                max=Math.max(max,count);
                count=1; start=nums[i];
                
            }
        }

        return max;

    }
}