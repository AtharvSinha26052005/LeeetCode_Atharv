class Solution {
    public boolean canReach(int[] arr, int start) 
    {
        return solve(arr, start);
    }

    static boolean solve(int arr[], int i)
    {
        int n = arr.length;

        if(i < 0 || i >= n || arr[i] == -1)
            return false;

        if(arr[i] == 0)
            return true;

        int jump = arr[i];

        arr[i] = -1; // mark visited

        boolean a = solve(arr, i + jump);
        boolean b = solve(arr, i - jump);

        return a || b;
    }
}