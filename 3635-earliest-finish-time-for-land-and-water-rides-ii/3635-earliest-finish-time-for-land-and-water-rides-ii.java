class Solution {
    public int earliestFinishTime(int[] landS, int[] landD, int[] waterS, int[] waterD) {
        int n=landS.length;
        int m=waterS.length;
        int minl=Integer.MAX_VALUE,minw=minl,res=minw;
        for(int i=0;i<n;i++)
        {
            minl=Math.min(minl,landS[i]+landD[i]);
        }

        for(int i=0;i<m;i++)
        {
            minw=Math.min(minw,waterS[i]+waterD[i]);
            res=Math.min(res,Math.max(minl,waterS[i])+waterD[i]);
        }
        for(int i=0;i<n;i++)
        {
            res=Math.min(res,Math.max(minw,landS[i])+landD[i]);
        }
        return res;
    }
}