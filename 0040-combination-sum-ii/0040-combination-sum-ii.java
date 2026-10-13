class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> res=new ArrayList<>();
      List<Integer> ds=new ArrayList<>();
      Arrays.sort(candidates);
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
            if(i>st && candidates[i]==candidates[i-1])
            continue;
            if(candidates[i]>target)
            break;

            ds.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],ds,res);
            ds.remove(ds.size()-1);
        }

    }
}