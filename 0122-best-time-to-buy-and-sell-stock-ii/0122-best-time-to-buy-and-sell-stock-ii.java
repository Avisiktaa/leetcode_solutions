class Solution {
    public int solve(int[] prices,int i,int buy,int[][] dp)
    {
        if(i==prices.length)
        return 0;
        int profit=0,take=0,not=0;

        if(dp[i][buy]!=-1)
        return dp[i][buy];

        if(buy==1)
        {
            take=-prices[i]+solve(prices,i+1,0,dp);
            not=solve(prices,i+1,1,dp);
            profit=Math.max(take,not);
        }
        else
        {
            take=prices[i]+solve(prices,i+1,1,dp);
            not=solve(prices,i+1,0,dp);
            profit=Math.max(take,not);
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
       return solve(prices,0,1,dp); 
    }
}