class Solution {
    public int[] findOrder(int num, int[][] prerequisites) {
        int count=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[num];
        for(int[] pre:prerequisites)
        {
            int course=pre[0];
            int prec=pre[1];
            adj.get(prec).add(course);
            indegree[course]++;
        }
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<num;i++)
        {
            if(indegree[i]==0)
            que.add(i);
        }
        int[] topo=new int[num];
        int i=0;
        while(!que.isEmpty())
        {
            int node=que.poll();
            count++;
            topo[i++]=node;
            for(int x:adj.get(node))
            {
                indegree[x]--;
                if(indegree[x]==0)
                que.add(x);
            }
        }
        if(count==num)
        return topo;
        return (new int[]{});
    }
}