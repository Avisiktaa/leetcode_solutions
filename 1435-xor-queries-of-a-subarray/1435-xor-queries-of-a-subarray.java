class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
      int []res=new int[queries.length];
      int ans=0;
      for(int i=0;i<queries.length;i++)
      {
        int st=queries[i][0];
        int end=queries[i][1];
        ans=0;
        while(st<=end)
        {
            ans^=arr[st];
            st++;
        }
        res[i]=ans;
      }
      return res;
    }
}