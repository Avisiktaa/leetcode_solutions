class Solution {
    public int helper(int n,int[] dp)
    {

        if(n==0) return 1;
        if(n<0) return 0;

        if(dp[n]!=-1)
        return dp[n];

        dp[n]=helper(n-1,dp) + helper(n-2,dp);

        return dp[n];
    }
    public int climbStairs(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        int prev1=1,prev2=1;
        for(int i=2;i<=n;i++)
        {
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        } 
        return prev1;
    }
}