class Solution {

    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int cnt=0,pre=0;
      map.put(0,1);
      for(int num:nums)
      {
        pre+=num;
        cnt+=map.getOrDefault(pre-k,0);
        map.put(pre,map.getOrDefault(pre,0)+1);
      } 
      return cnt;
    }
}