class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
      int []res=new int[queries.length];
      int []subxor=new int[arr.length];
      subxor[0]=arr[0];
      for(int i=1;i<arr.length;i++)
      {
        subxor[i]=subxor[i-1]^arr[i];
      }
      for(int i=0;i<queries.length;i++)
      {
        int st=queries[i][0];
        int end=queries[i][1];
        if(st==0)
        res[i]=subxor[end];
        else
        {
            res[i]=subxor[st-1]^subxor[end];
        }
      }
      return res;
    }
}