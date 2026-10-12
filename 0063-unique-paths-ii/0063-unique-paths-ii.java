class Solution {
    public int find(int[][] obstacle,int id1,int id2,int[][] dp)
    {
        if(id1==0 && id2==0 && obstacle[id1][id2]!=1)
        return 1;
        if(id1<0 || id2<0)
        return 0;
        if(obstacle[id1][id2]==1)
        return 0;
        if(dp[id1][id2]!=-1)
        return dp[id1][id2];
        return dp[id1][id2]=find(obstacle,id1,id2-1,dp)+find(obstacle,id1-1,id2,dp);
    }
    public int uniquePathsWithObstacles(int[][] obstacle) {
        int n=obstacle.length;
        int m=obstacle[0].length;
        int[][] dp=new int[n][m];
        if(obstacle[0][0]==1)
        return 0;
        dp[0][0]=1;
        for(int i=1;i<n;i++)
        {
            if(obstacle[i][0]!=1)
            dp[i][0]=dp[i-1][0];
        }
        for(int j=1;j<m;j++)
        {
            if(obstacle[0][j]!=1)
            dp[0][j]=dp[0][j-1];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(obstacle[i][j]!=1)
                dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }
}