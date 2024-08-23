class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1 && nums[0]==0)
        return 0;
       
        int left=0,right=0;
        for(int n:nums)
        {
            right+=n;
        }
        for(int i=0;i<nums.length;i++)
        {
            right-=nums[i];
            if(right==left)
            return i;
            left+=nums[i];
        }
        return -1;
    }
}