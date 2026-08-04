class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        int min=1000,max=0;
        for(int n:nums)
        {
            min=Math.min(min,n);
            max=Math.max(max,n);
            hs.add(n);
        }

        for(int i=min+1;i<max;i++)
        {
            if(!hs.contains(i))
            ans.add(i);
        }
        return ans;
    }
}