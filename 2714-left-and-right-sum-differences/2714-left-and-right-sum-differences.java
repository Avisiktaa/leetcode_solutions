class Solution {
    public int[] leftRightDifference(int[] nums) {
      int[] ans=new int[nums.length];
      int left=0,right=0;
      for(int n:nums)
      {
        right+=n;
      }
      for(int i=0;i<nums.length;i++)
      {
        right-=nums[i];
        ans[i]=Math.abs(right-left);
        left+=nums[i];
      }
      return ans;
    }
}