class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        int cnt=1,ans=0;
        while(k>0)
        {
            if(!set.contains(cnt))
            {
                ans=cnt;
                k--;
            }
            cnt++;
        }
        return ans;
    }
}