class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
                }
        int j=i+1,k=nums.length-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if (sum==target)
            {
                ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                j++;
                k--;
            }
            else if(sum<target)
            j++;
            else 
            k--;
        }   
    }
    return ans;
}
}