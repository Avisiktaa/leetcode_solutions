class Solution {

    public int jump(int[] nums) {
        int n=nums.length;
        int farthest=0,cnt=0,curr=0;
        for(int i=0;i<n-1;i++)
        {
           farthest=Math.max(farthest,i+nums[i]);
           if(i==curr)
           {
            cnt++;
            curr=farthest;
           }
            
        }
        return cnt;
    }
}