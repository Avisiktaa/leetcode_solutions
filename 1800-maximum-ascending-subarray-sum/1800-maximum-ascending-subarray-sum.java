class Solution {
    public int maxAscendingSum(int[] nums) {
        int res=nums[0];
        int maxs=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                res+=nums[i];
            }
            else
            res=nums[i];

            maxs=Math.max(maxs,res);
        }
        return maxs;
    }
}