class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> res=new ArrayList<>();
      List<Integer> ds=new ArrayList<>();
      backtrack(0,candidates,target,ds,res);
      return res;  
    }
    public void backtrack(int st,int[] candidates,int target,List<Integer> ds,List<List<Integer>> res)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=st;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            continue;

            ds.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i],ds,res);
            ds.remove(ds.size()-1);
        }

    }
}