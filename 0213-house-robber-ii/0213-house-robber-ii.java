class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];

        int case1=solve(nums,0,n-2);
        int case2=solve(nums,1,n-1);
        return Math.max(case1,case2);
    }
    public int solve(int[] nums,int start,int end)
    {
        int[] dp=new int[nums.length+2];
        for(int i=end;i>=start;i--)
        {
            int rob=nums[i]+dp[i+2];
            int skip=dp[i+1];
            dp[i]=Math.max(rob,skip);
        }
        return dp[start];
    }
}