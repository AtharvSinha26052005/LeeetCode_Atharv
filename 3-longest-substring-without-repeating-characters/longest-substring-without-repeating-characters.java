class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       HashSet<Character> set = new HashSet<>(); 
       int curr = 0, max = 0, left = 0;
       
       for(int i = 0; i < s.length(); i++)
       {
            char ch = s.charAt(i);
            if(!set.contains(ch))
            {
                set.add(ch);
                curr++;
                // max = Math.max(curr, max);
            }
            else
            {
                while (set.contains(ch)) 
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                // update curr to the current window size after removing duplicates
                curr = i - left + 1;
                set.add(ch);
                
            }
            max = Math.max(curr, max);
       }
       return max;
    }
}