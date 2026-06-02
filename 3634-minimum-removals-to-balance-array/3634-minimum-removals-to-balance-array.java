class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=0,ans=Integer.MIN_VALUE;

        while(r<n)
        {
            while((long)k*nums[l]<nums[r])
            l++;

            ans=Math.max(ans,r-l+1);
            r++;
        }
        return n-ans;
    }
}