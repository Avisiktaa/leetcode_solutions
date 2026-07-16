class Solution {

    private int[][] dp;
    private int func(int[] nums,int id,int prev)
    {   int n=nums.length;
        if(id==n)
        return 0;

        if(dp[id][prev+1]!=-1)
        return dp[id][prev+1];

        int len=0+func(nums,id+1,prev);

        if(prev==-1 || nums[id]>nums[prev])
        len=Math.max(len,1+func(nums,id+1,id));

        return dp[id][prev+1]=len;
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int[n][n+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return func(nums,0,-1);
    }
}