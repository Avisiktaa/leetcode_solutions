class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0],curr=0;
        for(int num:nums)
        {
            curr=Math.max(curr+num,num);
            res=Math.max(res,curr);
        }
        return res;
    }
}