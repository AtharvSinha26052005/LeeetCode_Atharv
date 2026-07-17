class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       HashMap<Character,Integer> map = new HashMap<>(); int res=0,max=Integer.MIN_VALUE,l=0;
       int k=0;

       for(int h=0;h<s.length();h++)
       {
        char ch = s.charAt(h);

        map.put(ch,map.getOrDefault(ch,0)+1);
        k=h-l+1;

        while(map.size()<k)
        {
            char left = s.charAt(l);
                
                //decrease
                map.put(left,map.get(left)-1);

            if(map.get(left)==0)
                map.remove(left);
                
                l++;

            k=h-l+1;
            
        }

        if(map.size()==k)
        res=Math.max(res,h-l+1);
        
    }

    return res;
}
}