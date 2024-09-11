class Solution {
    public int minBitFlips(int start, int goal) {
      String s1=Integer.toBinaryString(start);
      String s2=Integer.toBinaryString(goal);
      int n1=s1.length();
      int n2=s2.length();
      int i=n1-1,j=n2-1,count=0;
       while(i>=0 && j>=0)
       {
        if(s1.charAt(i)!=s2.charAt(j))
        {
            count++;
        }
        i--;
        j--;
       }
       while(i>=0)
       {
        if(s1.charAt(i)=='1')
        count++;
        i--;
       } 
       while(j>=0)
       {
        if(s2.charAt(j)=='1')
        count++;
        j--;
       } 
       return count;
    }
}