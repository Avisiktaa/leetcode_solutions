class Solution {
    public void dfs(int[][] image, int x,int y,int old,int color)
    {
        int m=image.length;
        int n=image[0].length;
        if(x<0 || x>=m || y<0 || y>=n || image[x][y]!=old)
        return;
        image[x][y]=color;
        dfs(image, x-1,y,old,color);
        dfs(image, x, y+1, old, color);
        dfs(image, x+1, y, old,color);
        dfs(image, x, y-1, old, color);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       if(image[sr][sc]==color)
       return image;

       int old=image[sr][sc];
       dfs(image,sr,sc,old,color);
       return image;
    }
}