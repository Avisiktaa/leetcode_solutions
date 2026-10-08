class Solution {
    public int solve(int id,int[] cost,int n)
    {
        if(id==n-2 || id==n-1)
        return cost[id];
        if(id>=n)
        return 0;
        int s1=cost[id]+solve(id+1,cost,n);
        int s2=cost[id]+solve(id+2,cost,n);

        return Math.min(s1,s2);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+2];
        for(int i=n-1;i>=0;i--)
        {
            dp[i]=cost[i]+Math.min(dp[i+2],dp[i+1]);
        }
        return Math.min(dp[0],dp[1]);
    }
}