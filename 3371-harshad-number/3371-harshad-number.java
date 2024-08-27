class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int rem=0,sum=0,c=0,ans=-1;
        c=x;
        while(x>0)
        {
            rem=x%10;
            x=x/10;
            sum+=rem;
        }
        if(c%sum==0)
        ans=sum;
        return ans;
    }
}