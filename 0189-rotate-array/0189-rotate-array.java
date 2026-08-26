class Solution {
    public void rever(int[] nums,int st,int end)
    {
        while(st<end)
        {
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;

            st++;
            end--;

        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rever(nums,0,n-k-1);
        rever(nums,n-k,n-1);
        rever(nums,0,n-1);
    }
}