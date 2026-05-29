class Solution {
    public int minElement(int[] nums) {
        int minsum=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {   int sum=0;
            while(nums[i]!=0)
            {
                int dig=nums[i]%10;
                sum+=dig;
                nums[i]/=10;
            }
            minsum=Math.min(minsum,sum);
        }
        return minsum;
    }
}