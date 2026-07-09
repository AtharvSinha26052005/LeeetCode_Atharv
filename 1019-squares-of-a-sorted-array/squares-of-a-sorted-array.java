class Solution {
    public int[] sortedSquares(int[] a)
    {
        int n = a.length;

        int left = 0;
        int right = n - 1;

        int[] ans = new int[n];

        int i = n - 1;

        while(left <= right)
        {
            if(Math.abs(a[left]) > Math.abs(a[right]))
            {
                ans[i] = a[left] * a[left];
                left++;
            }
            else
            {
                ans[i] = a[right] * a[right];
                right--;
            }

            i--;
        }

        return ans;
    }
}