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
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxlen=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
            maxlen=Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}