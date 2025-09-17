class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        if(n<2)
        return new int[]{-1,-1};
        else
        {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int comp=target - nums[i];
            if(hm.containsKey(comp))
            {
                int g=hm.get(comp);
                return new int[]{g,i};
            }
            else
            hm.put(nums[i],i);
        }

        return new int[]{-1,-1};
        }
    }
}