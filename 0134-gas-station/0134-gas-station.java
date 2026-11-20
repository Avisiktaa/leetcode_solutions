class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int totalgas=0,totalcost=0;
        for(int i=0;i<n;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalcost>totalgas)
        return -1;

        int curr=0,st=0;
        for(int i=0;i<n;i++)
        {
            curr+=gas[i]-cost[i];
            if(curr<0)
            {
                curr=0;
                st=i+1;
            }
        }
        return st;
    }
}