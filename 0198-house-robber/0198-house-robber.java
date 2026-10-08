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
        dp[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            int take=nums[i];
            if(i>1)
            take+=dp[i-2];

            int not=dp[i-1];
            dp[i]=Math.max(take,not);
        }
        return dp[n-1];
    }
}