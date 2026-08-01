class Solution {

    public int count(int[] nums,int k)
    {
        int left=0,cnt=0;
        long sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];

            while(sum>k && left<=right)
            {
                sum-=nums[left];
                left++;
            }
            cnt+=(right-left+1);
        }
        return cnt;
    }
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