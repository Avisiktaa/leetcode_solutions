class Solution {
    public int maximum69Number (int num) {
       int pos=0,cnt=0;
       int copy=num;
       while(num>0)
       {
        int rem=num%10;
        if(rem==6)
        {
            cnt++;
            pos=cnt;
        }
        else
        cnt++;
        num=num/10;
       }
       if(pos==0)
       return copy;

       int sum=3*(int)(Math.pow(10,pos-1));
       return copy+sum;

    }
}