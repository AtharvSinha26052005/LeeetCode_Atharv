class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
       int c1=0,c2=0;
       int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++)
       {
        if(c1==0 && el2!=nums[i])
        {
            el1=nums[i];c1=1;
        }

        else if(c2==0 && el1!=nums[i])
        {
            el2=nums[i];c2=1;
        }

       else if(el1==nums[i]) c1++;
       else if (el2==nums[i]) c2++;
       else {c1--;c2--;}
       }

        List<Integer> ans= new ArrayList<>();
        int cn1=0,cn2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==el1) cn1++;
            else if(nums[i]==el2) cn2++;
        }

        int maj= (int)(nums.length/3) +1;

        if(cn1>=maj) ans.add(el1);
        if(cn2>=maj) ans.add(el2);

        return ans;
    }
}