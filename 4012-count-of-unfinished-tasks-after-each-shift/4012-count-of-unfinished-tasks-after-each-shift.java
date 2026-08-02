class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
       int n=tasks.length;
       int m=shifts.length;
       int[] ans=new int[m];
       long[] pre=new long[n];
       pre[0]=tasks[0];
       for(int i=1;i<n;i++)
       {
        pre[i]=pre[i-1]+tasks[i];
       }
        long total=pre[n-1];
        long done=0;

        for(int i=0;i<m;i++)
        {
            done+=shifts[i];
            if(done>=total)
            {
                ans[i]=0;
                done=0;
                continue;
            }
            int l=0,r=n-1;
            while(l<=r)
            {
                int mid=(r+l)/2;
                if(pre[mid]>done)
                r=mid-1;
                else
                l=mid+1;
            }
            ans[i]=n-l;
        }
        return ans;
    }
}