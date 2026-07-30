class Solution {
    public String countAndSay(int n) {
       if(n==1)
       return "1";
       int count=0;
       String ans="1";
       for(int i=2;i<=n;i++)
       {
        count=1;
        StringBuilder sb=new StringBuilder();
        for(int j=1;j<ans.length();j++)
        {
            if(ans.charAt(j)==ans.charAt(j-1))
            count++;
            else
            {
                sb.append(count);
                sb.append(ans.charAt(j-1));
                count=1;
            }
        }
        sb.append(count);
        sb.append(ans.charAt(ans.length()-1));
        ans=sb.toString();
       } 
       return ans;
    }
}