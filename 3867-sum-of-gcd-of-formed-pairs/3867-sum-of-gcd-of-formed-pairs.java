class Solution {
    private int gcd(int a,int b)
    {
        int rem=0;
        while(b!=0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int maxi=0;
        int[] prefx=new int[n];
       for(int i=0;i<n;i++)
       {
        maxi=Math.max(nums[i],maxi);
        prefx[i]=gcd(maxi,nums[i]);
       } 
       Arrays.sort(prefx);
       int l=0,r=n-1;
       long ans=0;
       while(l<r)
       {
        int pre=gcd(prefx[r],prefx[l]);
        ans+=(long)pre;
        l++;
        r--;
       }
       return ans;
    }
}