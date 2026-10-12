class Solution {
    public int find(int[][] matrix,int i,int j,int n,int m,int[][] dp)
    {
        if(i<0 || i>=n || j<0 || j>=m)
        return (int)1e9;

        if(i==n-1)
        return matrix[i][j];
        if(dp[i][j]!=-1)
        return dp[i][j];

        int dr=find(matrix,i+1,j+1,n,m,dp);
        int dl=find(matrix,i+1,j-1,n,m,dp);
        int down=find(matrix,i+1,j,n,m,dp);
        return dp[i][j]=matrix[i][j]+Math.min(dr,Math.min(dl,down));
    }
    public int minFallingPathSum(int[][] matrix) {
       int n=matrix.length;
       int m=matrix[0].length;
       int ans=Integer.MAX_VALUE;
       int[][] dp=new int[n][m];
       
       for(int j=0;j<m;j++)
       {
        dp[n-1][j]=matrix[n-1][j];
       }
       for(int i=n-2;i>=0;i--)
       {
        for(int j=0;j<m;j++)
        {
            int dr=(j+1)<m?dp[i+1][j+1]:(int)1e9;
            int dl=(j-1)>=0?dp[i+1][j-1]:(int)1e9;
            int down=dp[i+1][j];
            dp[i][j]=matrix[i][j]+Math.min(dr,Math.min(dl,down));
        }
       }
       for(int j=0;j<m;j++)
       {
        ans=Math.min(ans,dp[0][j]);
       }
       return ans;
    }
}