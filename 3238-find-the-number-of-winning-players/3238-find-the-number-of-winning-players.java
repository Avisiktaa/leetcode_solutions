class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
     int len=pick.length;
     int[][] arr=new int[n][11];

     for(int i=0;i<len;i++)
     {
        int player=pick[i][0];
        int color=pick[i][1];
        arr[player][color]++;
     } 
    int count=0;
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<11;j++)
        {
            if(arr[i][j]>=i+1)
            {
            count++;
            break;
            }
        }
     }
     return count;
    }
}