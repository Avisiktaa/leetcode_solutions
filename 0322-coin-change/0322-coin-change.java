class Solution {
    public int solve(int[] coins,int amount,int id,int[][] dp)
    {
        if(id==0)
        {
            if(amount%coins[id]==0)
            return (amount/coins[id]);
            else
            return (int)1e9;
        }
        if(dp[id][amount]!=-1)
        return dp[id][amount];

        int not=solve(coins,amount,id-1,dp);
        int take=Integer.MAX_VALUE;
        if(coins[id]<=amount)
        {
            take=1+solve(coins,amount-coins[id],id,dp);
        }
        return dp[id][amount]=Math.min(take,not);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int ans= solve(coins,amount,n-1,dp);
        return ans!=1e9?ans:-1;
    }
}