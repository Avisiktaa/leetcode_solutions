class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int len=0,maxlen=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            len=0;
            else
                len++;
            maxlen=Math.max(maxlen,len);
        }
        return maxlen;
    }
}