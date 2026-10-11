class Solution {

    public int longestPalindromeSubseq(String s) {
        String s2="";
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            s2+=s.charAt(i);
        }
        int[] prev=new int[n+1];
        int[] curr=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s.charAt(i-1)==s2.charAt(j-1))
                curr[j]=1+prev[j-1];
                else
                curr[j]=Math.max(prev[j],curr[j-1]);
            }
            prev=curr.clone();
        }
        return prev[n];
    }
}