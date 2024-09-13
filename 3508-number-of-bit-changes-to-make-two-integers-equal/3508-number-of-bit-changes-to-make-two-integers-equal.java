class Solution {
    public int minChanges(int n, int k) {
      String bn=Integer.toBinaryString(n);
      String bk=Integer.toBinaryString(k);
      if(bn.length()<bk.length())
      return -1;
      int i=bn.length()-1,j=bk.length()-1,count=0;
      while(i>=0 && j>=0)
      {
        char cn=bn.charAt(i--),ck=bk.charAt(j--);
        if(cn!=ck)
        {
            if(cn=='1') 
            count++;
            else
            return -1;
        }
      }
      while(i>=0)
      {
        if (bn.charAt(i--)=='1')
        count++;
      }
        return count;
    }
}