class Solution {
    public int solve(int id,int[] coins,int amount,int[][] dp)
    {
        if(id==0)
        {
            if(amount%coins[id]==0)
            return 1;
            else return 0;
        }
        if(dp[id][amount]!=-1)
        return dp[id][amount];

            int not=solve(id-1,coins,amount,dp);
            int take=0;
            if(coins[id]<=amount)
            take=solve(id,coins,amount-coins[id],dp);

            return dp[id][amount]=take+not;
        }
    
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(n-1,coins,amount,dp);
    }
}