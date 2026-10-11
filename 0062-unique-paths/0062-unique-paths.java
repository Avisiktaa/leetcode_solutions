class Solution {
    public int find(int r,int c,int[][] dp)
    {
        if(r==0 && c==0)
        return 1;

        if(r<0 || c<0)
        return 0;

        if(dp[r][c]!=-1)
        return dp[r][c];

        return dp[r][c]=find(r,c-1,dp)+find(r-1,c,dp);
    }
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}