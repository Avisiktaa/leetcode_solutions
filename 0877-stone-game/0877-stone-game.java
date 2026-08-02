class Solution {
     public int find(int[] nums,int i,int j,int[][] dp)
    {
        if(i==j)
        return nums[i];

        if(dp[i][j]!=-1)
        return dp[i][j];

        int left=nums[i]-find(nums,i+1,j,dp);
        int right=nums[j]-find(nums,i,j-1,dp);

        return dp[i][j]=Math.max(left,right);
    }
    public boolean stoneGame(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        for(int[] rows:dp)
        {
            Arrays.fill(rows,-1);
        }

        return find(nums,0,n-1,dp)>=0;
    }
}