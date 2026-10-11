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
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return find(text1,text2,n-1,m-1,dp);
    }
}