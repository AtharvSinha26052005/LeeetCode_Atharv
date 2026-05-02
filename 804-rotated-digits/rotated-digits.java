class Solution {
    public int rotatedDigits(int n) 
    {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0, 0);
        // map.put(1, 1);
        // map.put(2, 5);
        // map.put(5, 2);
        // map.put(6, 9);
        // map.put(8, 8);
        // map.put(9, 6);


        int c=0;
        for(int i=1;i<=n;i++)
        {
            int num=i;
            boolean valid=true;
            boolean diff=false;
            while(num>0)
            {
                int d=num%10;
                
                if(d==3||d==4||d==7)
                {
                    valid=false;break;
                }

                else if (d==2 || d==5 || d==6 || d==9)
                {
                    diff=true;
                }

                num/=10;
            }

           // if(f==1) continue;
            
            if(valid && diff)
            {
                c++;
            }

        }

        return c;
        
    }
}