class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxid=0;
        for(int i=0;i<=maxid;i++)
        {
            maxid=Math.max(maxid,i+nums[i]);
            if(maxid>=n-1)
            return true;
        }
        return false;
    }
}