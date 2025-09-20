class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> ans= new ArrayList<>();
        Map<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        //System.out.println(mpp);

        for(Map.Entry<Integer,Integer> it: mpp.entrySet())
        {
            if(it.getValue()>nums.length/3)
            ans.add(it.getKey());
        }
        return ans;
    }
}