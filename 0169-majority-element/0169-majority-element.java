class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
      int maj=0;
      int cnt=0;
      for(int num:nums)
      {
        if(num==maj)
        cnt++;
        else if(cnt==0)
        {
            maj=num;
            cnt++;
        }
        else
        cnt--;
      }
      cnt=0;
      for(int num:nums)
      {
        if(num==maj)
        {
            cnt++;
            if(cnt>n/2)
            return num;
        }
      }
      return 0;
    }
}