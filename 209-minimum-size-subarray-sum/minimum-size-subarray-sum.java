class Solution {
    public int minSubArrayLen(int t, int[] a) {

        int n = a.length;
        int i = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int j = 0; j < n; j++) {

            sum += a[j];

            while(sum >= t) {
                ans = Math.min(ans, j - i + 1);
                sum -= a[i];
                i++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}