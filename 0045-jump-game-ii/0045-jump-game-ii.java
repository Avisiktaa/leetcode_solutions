class Solution {

    int[] dp;

    public int solve(int i,int[] nums)
    {
        int n=nums.length;

        if(i==n-1)
        return 0;

        if(dp[i]!=-1)
        return dp[i];

        int minj=Integer.MAX_VALUE;
        for(int j=1;j<=nums[i];j++)
        {
            if(i+j<n)
            {
                int jump=solve(i+j,nums);
                if(jump!=Integer.MAX_VALUE)
                {
                    minj=Math.min(minj,1+jump);
                }
            }
        }
        return dp[i]=minj;
    }
    public int jump(int[] nums) {
        int n=nums.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=solve(0,nums);
        return ans;
    }
}