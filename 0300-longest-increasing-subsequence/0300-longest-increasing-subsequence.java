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
        int[] temp=new int[n];
        temp[0]=nums[0];
        int len=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>temp[len-1])
            {
                temp[len]=nums[i];
                len++;
            }
            else
            {
                int low=Arrays.binarySearch(temp,0,len,nums[i]);
                if(low<0)
                low=-(low+1);
                temp[low]=nums[i];
            }
        }
        return len;
    }
}