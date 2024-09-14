class Solution {
    public int longestSubarray(int[] nums) {
       int max=nums[0],len=0,cnt=0;
       for(int i=1;i<nums.length;i++)
       {
            if(max<=nums[i])
            max=nums[i];
       }
        for(int n:nums)
        {
            if(n==max)
            {
                cnt++;
                len=Math.max(len,cnt);
            }
            else
            cnt=0;
        }
        return len;
    }
}