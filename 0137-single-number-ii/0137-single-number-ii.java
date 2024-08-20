class Solution {
    public int singleNumber(int[] nums) {
      Arrays.sort(nums);
      if(nums.length==1)
      return nums[0];
      int ans=0,i=0;
      int j=0;
      j=2;
      while(j<nums.length){
        if(nums[i]==nums[j])
        {
            ans=nums[j+1];
            i+=3;
            j+=3;
            
        }
        else
        {
           ans=nums[i]; 
           break;
           
        }
      }
      return ans;  
    }
}