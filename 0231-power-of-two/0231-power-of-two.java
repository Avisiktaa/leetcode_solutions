class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        return false;
        if(n==1)
        return true;
        
        int l=1,r=n;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(Math.pow(2,mid)==n)
            return true;
            
            else if(Math.pow(2,mid)>n)
            r=mid-1;
            
            else
            l=mid+1;
        }
        return false;

    }
}