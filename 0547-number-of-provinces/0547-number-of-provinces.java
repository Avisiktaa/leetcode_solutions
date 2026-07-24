class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count = 0;
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!vis[i])
            {
                dfs(adj,vis,i);
                count++;
            }
        }
        return count;
    }
    private void dfs( ArrayList<ArrayList<Integer>> adj,boolean[] vis,int s)
    {
        vis[s]=true;
        for(int x:adj.get(s))
        {
            if(!vis[x])
            {
                dfs(adj,vis,x);
            }
        }
    }
}