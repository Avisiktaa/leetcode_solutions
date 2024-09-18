class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans=0,p=1,i=0;
        while(i<4)
        {
            int t=Math.min(num1%10,Math.min(num2%10,num3%10));
            ans=ans+t*p;

            num1/=10;
            num2/=10;
            num3/=10;

            p=p*10;
            i++;
        }
        return ans;
    }
}