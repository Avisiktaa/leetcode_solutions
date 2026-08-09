class Solution {
    Boolean[][] dp;
    public boolean find(int id,int sum,int[] nums)
    {
        if(sum==0)
        return true;
        if(id==0)
        return nums[id]==sum;

        if(dp[id][sum]!=null)
        return dp[id][sum];

        boolean notpick=find(id-1,sum,nums);
        boolean pick=false;
        if(sum>=nums[id])
        pick=find(id-1,sum-nums[id],nums);

        return dp[id][sum]=pick||notpick;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int num:nums)
        {
            total+=num;
        }
        if(total%2!=0)
        return false;
        int sum=total/2;
        dp=new Boolean[n][sum+1];
        
        return (find(n-1,sum,nums));
    }
}