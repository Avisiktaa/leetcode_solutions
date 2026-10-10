class Solution {
    public boolean canFinish(int num, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int count=0;
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
        while(!que.isEmpty())
        {
            int node=que.poll();
            count++;
            for(int x:adj.get(node))
            {
                indegree[x]--;
                if(indegree[x]==0)
                que.add(x);
            }
        }
        return (count==num);
    }
}