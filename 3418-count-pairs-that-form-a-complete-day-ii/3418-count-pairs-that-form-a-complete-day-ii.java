class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int[] map=new int[24];
        long c=0;
        for(int i:hours)
        {
            if(i%24==0)
            c+=map[i%24];
            else
            c+=map[24-i%24];
            map[i%24]++;
        }
        return c;
    }
}