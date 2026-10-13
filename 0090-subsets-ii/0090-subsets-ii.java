class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,res,ds);
        return res;
        }
        public void backtrack(int[] nums,int id,List<List<Integer>> res,List<Integer> ds)
        {
            res.add(new ArrayList<>(ds));
            for(int i=id;i<nums.length;i++)
            {
                if(i>id && nums[i]==nums[i-1])
                continue;

                ds.add(nums[i]);
                backtrack(nums,i+1,res,ds);
                ds.remove(ds.size()-1);
            }
        }
}