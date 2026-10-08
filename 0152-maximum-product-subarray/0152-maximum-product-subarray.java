class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int left=1;
        int right=1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(left==0)
            left=1;
            if(right==0)
            right=1;

            left*=nums[i];
            int j=n-1-i;
            right*=nums[j];
            maxi=Math.max(left,Math.max(right,maxi));
        }
        return maxi;
    }
}