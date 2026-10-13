class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            nums[i]=-1 * nums[i];
        }
        Arrays.sort(nums);
        int times=n/2;
        for(int i=0;i<times;i++)
        {
            sum=sum-(nums[i]*nums[i]);
        }
        for(int i=times;i<n;i++)
        {
            sum+=(nums[i]*nums[i]);
        }
        return sum;
    }
}