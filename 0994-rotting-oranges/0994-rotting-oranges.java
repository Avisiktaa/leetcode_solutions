class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        int time=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                q.add(new int[]{i,j,0});
                }
                else if(grid[i][j]==1)
                fresh++;
            }
        }
        if(fresh==0)
        return 0;
        int[][] dirs={{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty())
        {
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            int t=curr[2];
            time=Math.max(time,t);

            for(int[] d:dirs)
            {
                int nr=d[0]+r;
                int nc=d[1]+c;
                if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1)
                {
                    grid[nr][nc]=2;
                    fresh--;
                    q.add(new int[]{nr,nc,t+1});
                }
            }
        }
        return fresh==0?time:-1;
    }
}