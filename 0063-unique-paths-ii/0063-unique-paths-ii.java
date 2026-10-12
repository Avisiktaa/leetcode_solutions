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
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return find(obstacle,n-1,m-1,dp);
    }
}