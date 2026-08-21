class Solution {
    public int trailingZeroes(int n) {
        int quo=01;
        int div=5;
        int cnt=0;
        while(quo>0)
        {
            quo=n/div;
            cnt+=quo;
            div*=5;
        }
        return cnt;
    }
}