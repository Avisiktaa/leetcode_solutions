class Solution {

    public int gcd(int a,int b)
    {
        while(b>0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        long ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {   long a=nums[i];
                long b=nums[j];
                long gg=(nums[i]>nums[j])?gcd(nums[i],nums[j]):gcd(nums[j],nums[i]);
                long val=(a*b)/(gg*gg);
                ans=Math.max(ans,val);
            }
        }
        return ans;
    }
}