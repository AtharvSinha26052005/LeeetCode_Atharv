class Solution {
    public boolean canReach(int[] arr, int start) 
    {
        int n=arr.length;

        boolean vis[]= new boolean[n];
        Arrays.fill(vis,false);
        Queue<Integer> q = new LinkedList();

        q.offer(start);
        vis[start] = true;

        while(!q.isEmpty())
        {
            int i=q.poll();
          
             if(arr[i]==0) return true;

             int a=i+arr[i];
             int b = i-arr[i];

             if(a<n && a>=0 && !vis[a])
             {
                vis[a] = true;
                q.offer(a);
             }

             if(b<n && b>=0 && !vis[b])
             {
                vis[b] = true;
                q.offer(b);
             }
        }

        return false;


    }
    
}