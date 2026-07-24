class Solution {

    private void dfs(int r,int c,int[][] image,int col,int[] delrow,int[] delcol,int inicolor,int[][] ans)
    {
        ans[r][c]=col;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++)
        {
            int nr=r+delrow[i];
            int nc=c+delcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && ans[nr][nc]==inicolor)
            {
                dfs(nr,nc,image,col,delrow,delcol,inicolor,ans);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int inicolor=image[sr][sc];
       if(inicolor==color)
       return image;
       int[][] ans=image;

       int delrow[]={-1,0,1,0};
       int delcol[]={0,1,0,-1};
       dfs(sr,sc,image,color,delrow,delcol,inicolor,ans);
       return ans; 
    }
}