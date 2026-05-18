class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n==1)
        return 0;

        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            graph.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }

        boolean[] vis=new boolean[n];
        Queue<Integer> que=new LinkedList<>();
        vis[0]=true;
        que.add(0);
        int steps=0;

        while(!que.isEmpty())
        {
            int size=que.size();
            for(int s=0;s<size;s++)
            {
                int node=que.poll();

                if(node==n-1)
                return steps;

                if(node-1>=0 && !vis[node-1])
                {
                    vis[node-1]=true;
                    que.add(node-1);
                }

                if(node+1<n && !vis[node+1])
                {
                    vis[node+1]=true;
                    que.add(node+1);
                }

                if(graph.containsKey(arr[node]))
                {
                    for(int j:graph.get(arr[node]))
                    {
                        if(!vis[j])
                        {
                            vis[j]=true;
                            que.add(j);
                        }
                    }
                    graph.remove(arr[node]);
                }
            }
            steps++;
        }
        return -1;
    }
}