class Solution {
    public List<Integer> spiralOrder(int[][] arr) 
    {
        int n=arr.length,m=arr[0].length;
        List<Integer> ans= new ArrayList<>();

        int top=0,left=0,bottom=n-1,right=m-1;

        while(top<=bottom && left<=right)
        {
            //left->right
            for(int i=left;i<=right;i++) ans.add(arr[top][i]);
            top++;

            //top->bottom
            for(int i=top;i<=bottom;i++) ans.add(arr[i][right]);
            right--;

            if(top<=bottom){
            //for right to left
            for(int i=right;i>=left;i--) ans.add(arr[bottom][i]);
            bottom--;}

            if(left<=right){
            //bottom->top
            for(int i=bottom;i>=top;i--) ans.add(arr[i][left]);
            left++;
            }
        }

        return ans;
    }
}