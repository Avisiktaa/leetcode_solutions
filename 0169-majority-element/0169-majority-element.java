class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       Map<Integer,Integer> freq=new HashMap<>();

       for(int num:nums)
       {
        freq.put(num,freq.getOrDefault(num,0)+1);
       } 
       n=n/2;
       for(Map.Entry<Integer,Integer> entry:freq.entrySet())
       {
        if(entry.getValue()>n)
        return entry.getKey();
       }
       return 0;
    }
}