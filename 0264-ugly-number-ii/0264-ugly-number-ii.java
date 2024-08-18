class Solution {
    public int nthUglyNumber(int n) {
      int ans=0,k=2;
      int[] ugly=new int[n];
      if(n==1)
      return n;
      int f2=0,f3=0,f5=0;
      ugly[0]=1;
      for(int i=1;i<n;i++)
      {
        ugly[i]=Math.min(ugly[f2]*2,Math.min(ugly[f3]*3,ugly[f5]*5));
        if(ugly[i]==ugly[f2]*2)
        f2++;
        if(ugly[i]==ugly[f3]*3)
        f3++;
        if(ugly[i]==ugly[f5]*5)
        f5++;
      }
      return ugly[n-1]; 
    }
}