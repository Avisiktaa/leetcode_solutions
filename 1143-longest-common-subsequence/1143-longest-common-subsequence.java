class Solution {
    public int find(String text1, String text2, int id1, int id2,int[][] dp)
    {
        if(id1<0 || id2<0)
        return 0;
        if(dp[id1][id2]!=-1)
        return dp[id1][id2];

        if(text1.charAt(id1)==text2.charAt(id2))
        return dp[id1][id2]=1+find(text1,text2,id1-1,id2-1,dp);

        return dp[id1][id2]=Math.max(find(text1,text2,id1-1,id2,dp),find(text1,text2,id1,id2-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[] prev=new int[m+1];
        int[] curr=new int[m+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                curr[j]=1+prev[j-1];
                else
                curr[j]=Math.max(prev[j],curr[j-1]);
            }
            prev=curr.clone();
        }
        return prev[m];
    }
}