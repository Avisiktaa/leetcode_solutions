class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        n=n/3;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            if(entry.getValue()>n)
            res.add(entry.getKey());
        }
        return res;
    }
}