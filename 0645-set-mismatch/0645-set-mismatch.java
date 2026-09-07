class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        for (int i = 0; i < nums.length; ) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
            
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++; 
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                ans[0]=nums[i];
                ans[1]=i+1;
                break;
            }
        }
        return ans;
    }
}