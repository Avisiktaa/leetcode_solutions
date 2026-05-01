class Solution {
    public int maxRotateFunction(int[] nums) {
        int n= nums.length;
        int maxi=0;
        int total=0,sum=0;

        for(int i=0;i<n;i++)
        {
            total+=nums[i];
            sum+=nums[i]*i;
        }
        maxi=sum;
        for(int i=n-1;i>=1;i--)
        {
            sum+= total-(nums[i]*(n-1))-nums[i];
            maxi=Math.max(sum,maxi);
        }
        return maxi;
    }
}