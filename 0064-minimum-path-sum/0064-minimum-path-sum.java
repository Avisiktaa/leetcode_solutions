class Solution {
    public int find(int ind1,int ind2,int[][] grid,int[][] dp)
    {
        if(ind1==0 && ind2==0)
        return grid[0][0];
        if(ind1<0 || ind2<0)
        return (int)1e9;

        if(dp[ind1][ind2]!=-1)
        return dp[ind1][ind2];

        int left=grid[ind1][ind2]+find(ind1,ind2-1,grid,dp);
        int up=grid[ind1][ind2]+find(ind1-1,ind2,grid,dp);

        return dp[ind1][ind2]=Math.min(left,up);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];

        for(int j=1;j<n;j++)
        {
            dp[0][j]=grid[0][j]+dp[0][j-1];
        }
        for(int i=1;i<m;i++)
        {
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
}