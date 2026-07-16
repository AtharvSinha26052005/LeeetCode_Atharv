class Solution {
    public int totalFruit(int[] a) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l=0,k=2;
        int res=-1;
        for(int h=0;h<a.length;h++)
        {
            int ch=a[h];
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            //map.put(key, map.getOrDefault(key, defaultValue) + newValue);
            
            //shrink when it gets >k
            while(map.size()>k)
            {
                
                int left = a[l];
                
                //decrease
                map.put(left,map.get(left)-1);
                
                //remove the one with 0 characters
                if(map.get(left)==0)
                map.remove(left);
                
                l++;
            }
            
            //when its equal compute the result
            if(map.size()<=k)
            res=Math.max(res,h-l+1);
            
        }
        return res;
    }
}