class Solution {

    public int subarraySum(int[] nums, int k) {
      int n=nums.length,cnt=0,pre=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      map.put(0,1);
      for(int i=0;i<n;i++)
      {
        pre+=nums[i];
        if(map.containsKey(pre-k))
        {
            cnt+=map.get(pre-k);
        }
        map.put(pre,map.getOrDefault(pre,0)+1);
      }
      return cnt;
    }
}