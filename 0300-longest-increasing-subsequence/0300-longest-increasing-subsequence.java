class Solution {
    public int solve(int[] nums,int id,int prev,int n,int[][] dp)
    {
        if(id==n)
        return 0;
        if(dp[id][prev+1]!=-1)
        return dp[id][prev+1];

        int not=solve(nums,id+1,prev,n,dp);
        int take=0;
        if(prev==-1 || nums[id]>nums[prev])
        take=1+solve(nums,id+1,id,n,dp);
        return dp[id][prev+1]=Math.max(take,not);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(nums,0,-1,n,dp);
    }
}