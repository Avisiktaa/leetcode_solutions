class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        if(n==1)
        {
            ans.add(nums[0]);
            return ans;
        }
        int maxl=nums[0],maxr=nums[n-1];
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=nums[0];
        right[n-1]=nums[n-1];

        for(int i=1;i<n;i++)
        {
            if(maxl==nums[i])
            left[i]=0;
            else
            {
            left[i]=Math.max(maxl,nums[i]);
            maxl=left[i];
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(maxr==nums[i])
            right[i]=0;
            else
            {
            right[i]=Math.max(maxr,nums[i]);
            maxr=right[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(left[i]==nums[i] || right[i]==nums[i])
            ans.add(nums[i]);
        }
        return ans;
    }
}