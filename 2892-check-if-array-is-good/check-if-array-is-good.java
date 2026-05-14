class Solution 
{
    public boolean isGood(int[] nums) 
    {
        Arrays.sort(nums);
        int n=nums.length;

        if(nums[n-1]!=n-1) return false;


        for(int i=0;i<n-1;i++)
        {
            if(nums[i]!=i+1) return false;
        }

        return true;
        //if(nums[])

        // Map<Integer,Integer> mp = new HashMap<>();

        // for(int i=0;i<n;i++)
        // {
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // }

        // int i=0;
        // for(Map.Entry<Integer,Integer> ent : mp.entrySet())
        // {
        //     if(i<n-1)
        //     {
        //         if((ent.getKey()!=i+1) || (ent.getValue()!=1)) return false;
        //     }

        //     else if((ent.getKey()!=nums[n-1]) || (ent.getValue()!=2)) return false;

        //    // else return true;
        //     i++;
        // }

        // return true;

    }
}