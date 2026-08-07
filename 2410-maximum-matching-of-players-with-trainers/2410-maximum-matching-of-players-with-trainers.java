class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
       int m=players.length, n=trainers.length;
       int i=0,j=0;
       int cnt=0;
       Arrays.sort(players);
       Arrays.sort(trainers);

       while(i<m && j<n)
       {
        if(players[i]<=trainers[j])
        {
            i++;j++;cnt++;
        }
        else
        j++;
       } 
       return cnt;
    }
}