class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length<=1) return nums.length;
       Set<Integer> hs=new HashSet<>();

       for(int i=0;i<nums.length;i++)
       hs.add(nums[i]);

       int max1=1;
       for(int it:hs)
       {
        if(!hs.contains(it-1))
        {
            int count=1,x=it;
            while(hs.contains(x+1))
            {
                x++;count++;
            }

            max1=Math.max(count,max1);
        }
       }
       return max1;

        
    }
}