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
        for(int[] rows:dp)
        {
            Arrays.fill(rows,-1);
        }
        int ans=find(m-1,n-1,grid,dp);
        return ans;
    }
}