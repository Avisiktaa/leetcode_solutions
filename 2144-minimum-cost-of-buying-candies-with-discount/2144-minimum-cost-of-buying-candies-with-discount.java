class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        if(n==1)
        return cost[0];

        if(n==2)
        return cost[0]+cost[1];
        int res=0;
        int times=n/3;
        int p=n-1;
        for(int t=0;t<times;t++)
        {
            res+=cost[p]+cost[p-1];
            p-=3;
        }
        while(p>=0)
        {
            res+=cost[p];
            p--;
        }

        return res;
    }
}