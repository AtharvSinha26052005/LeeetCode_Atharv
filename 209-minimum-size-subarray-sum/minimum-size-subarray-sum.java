class Solution {
    public int minSubArrayLen(int t, int[] a) 
    {
        int n=a.length;
        int i=0,j=0;

        int c=0,min_d=a.length+10;
        //if(a[i]>=t) return 1;
       // int sum=0;
        int sum=a[i];

        while(i<n && j<n)
        {
            if(sum>=t)
            {c=j-i+1;
            min_d=Math.min(min_d,c);
            sum=sum-a[i];
            i++;
            }
            else 
            {
                j++;
                if (j < n) sum += a[j];
            }
        }

        if(min_d==a.length+10) return 0;
        else
        return min_d;
        
    }
}