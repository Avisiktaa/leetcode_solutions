class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int sum=0;
        int c=n;
        int k=n;
        while(c>0)
        {
            int rem=c%10;
            sum+=rem;
            prod*=rem;
            c/=10;
        }
        return (n%(sum+prod)==0);
    }
}