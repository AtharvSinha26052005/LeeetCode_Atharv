class Solution {
    public int rotatedDigits(int n) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 5);
        map.put(5, 2);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);


        int c=0;
        //StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++)
        {
            int num=i,d=0,f=0;
            String num1="";
            while(num>0)
            {
                d=num%10;
                if(!map.containsKey(d)) {f=1;break;}
                num1= String.valueOf(map.get(d)) + num1;
                num/=10;
            }

            if(f==1) continue;
            

            if(i!=Integer.parseInt(num1))
            {System.out.print(num1 + " ");c++;
            }
        }

        return c;
        
    }
}