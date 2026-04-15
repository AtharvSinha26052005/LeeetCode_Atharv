class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int mat[][]=new int[26][26];
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(i==j)mat[i][j]=0;
                else mat[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<cost.length;i++){
            int r=original[i]-97;
            int c=changed[i]-97;
            mat[r][c]=Math.min(cost[i],mat[r][c]);
        }

        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(i==j || k==i || k==j || mat[i][k]==Integer.MAX_VALUE || mat[k][j]==Integer.MAX_VALUE)continue;
                    mat[i][j]=Math.min(mat[i][j],mat[i][k]+mat[k][j]);
                }
            }
        }

        long sum=0;
        boolean check=false;
        for(int i=0;i<source.length();i++){
            int r=source.charAt(i)-97;
            int c=target.charAt(i)-97;
            if(mat[r][c]==Integer.MAX_VALUE){
                check=true;
                break;
            }
            sum+=mat[r][c];
        }
        if(check)return -1;
        else return sum;
    }
}