class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt=0,maxc=0;
       HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int curr=num;
                cnt=1;
                while(set.contains(curr+1))
                {
                    cnt++;
                    curr++;
                }
                maxc=Math.max(maxc,cnt);
            }
           
        }
         return maxc;
    }
}