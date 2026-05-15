class Solution {
    public int findMin(int[] arr) {
        
        int l=0;
        int u=arr.length-1,ans=Integer.MAX_VALUE;
        
        while(l<=u)
        {
            int mid=l+(u-l)/2;
            
            //if(nums[mid]==target)
            //return mid;
            
            if(arr[l]<=arr[mid])
            {
                ans=Math.min(ans,arr[l]);
                l=mid+1;
            }
            else
            {
                ans=Math.min(ans,arr[mid]);
                u=mid-1;
            }
        }

        return ans;

        
    }
}