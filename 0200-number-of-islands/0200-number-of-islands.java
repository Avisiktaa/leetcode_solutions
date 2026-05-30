class Solution {

    public void dfs(int i,int j,boolean[][] vis,char[][] grid,int n,int m)
    {
        vis[i][j]=true;
        int[][] dirs={{-1,0},{0,1},{1,0},{0,-1}};

        for(int[] d:dirs)
        {
            int nr=i+d[0];
            int nc=j+d[1];

            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1' && !vis[nr][nc])
            dfs(nr,nc,vis,grid,n,m);
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    dfs(i,j,vis,grid,n,m);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}