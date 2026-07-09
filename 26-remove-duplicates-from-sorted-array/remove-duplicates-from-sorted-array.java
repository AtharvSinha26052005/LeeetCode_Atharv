class Solution {
    public int removeDuplicates(int[] a) 
    {
        int n=a.length;
        int i=0;

        int c=0;

        if(n==0) return 0;
        if(n==1) return 1;

        for(int j=1;j<n;j++)
        {
            if(a[i]!=a[j])
            {
                i++;
                a[i]=a[j];
                c++;
            }
        }

        return c+1;
        
    }
}