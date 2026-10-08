class Solution {
    public int solve(int[] nums,int id,int[] dp)
    {
        if(id==0)
        return nums[id];
        if(id<0)
        return 0;

        if(dp[id]!=-1)
        return dp[id];
        int pick=nums[id]+solve(nums,id-2,dp);
        int not=solve(nums,id-1,dp);

        return dp[id]= Math.max(pick,not);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(nums,n-1,dp);
    }
}