class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }

        if(nums.length!=max+1)
        return false;

        int[] freq=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<1 || nums[i]>max)
            return false;

            freq[nums[i]]++;
        }

        for(int i=1;i<max;i++)
        {
            if(freq[i]!=1)
            return false;
        }

        return freq[max]==2;
    }
}