class Solution {
    public boolean isPalindrome(int x) {
        int s=0,d=0,a=x;
        while(x!=0)
        {
            d=x%10;
            s=(s*10)+d;
            x=x/10;
        }
        if(a<0)
        {
            s=s*(-1);
        }
        
           if(s==a){
               
            return true;
        }
        else
            return false;
    }
}