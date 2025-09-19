class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> pascal=new ArrayList<>();
        
        if(numRows==0)
        return pascal;

            pascal.add(new ArrayList<>());pascal.get(0).add(1);

        for(int i=1;i<numRows;i++)
        {
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = pascal.get(i-1);
            
            curr.add(1);

            for(int j=1;j<i;j++)
            {
                int a=prev.get(j-1); int b=prev.get(j);
                int sum=a+b;
                curr.add(sum);
            }

            curr.add(1);
            pascal.add(curr);
        }

        return pascal;
        
    }
}