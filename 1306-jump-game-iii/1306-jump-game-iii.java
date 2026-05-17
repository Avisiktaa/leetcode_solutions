class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> que=new LinkedList<>();
        int n=arr.length,id=-1;
        boolean[] vis=new boolean[n];

        que.add(start);
        vis[start]=true;
        while(!que.isEmpty())
        {
            int num=que.peek();
            que.poll();
            if(arr[num]==0)
            return true;

            int rig=num+arr[num];
            int lef=num-arr[num];

            if(rig<n && !vis[rig])
            {
                que.add(rig);
                vis[rig]=true;
            }
            if(lef>=0 && !vis[lef])
            {
                que.add(lef);
                vis[lef]=true;
            }
            

        }
        return false;
    }
}