class Solution {
    public int sum(int n)
    {
        int res=0;
        while(n>0)
        {
            int rem=n%10;
            res+=rem;
            n/=10;
        }
        return res;
    }
    public int smallestIndex(int[] nums) {
        int res=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(sum(nums[i])==i)
            {
            res=i;
            break;
            }
        }
        return res;
    }
}