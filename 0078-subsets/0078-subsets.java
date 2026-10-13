class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        backtrack(nums,0,ds,res);
        return res;
    }
    public void backtrack(int[] nums,int i,List<Integer> ds,List<List<Integer>> res)
    {
        if(i>=nums.length)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        backtrack(nums,i+1,ds,res);
        ds.remove(ds.size()-1);
        backtrack(nums,i+1,ds,res);
    }
}