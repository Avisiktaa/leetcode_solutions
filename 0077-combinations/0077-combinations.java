class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        back(n,k,1,ds,res);
        return res;
    }
    public void back(int n,int k,int id,List<Integer> ds,List<List<Integer>> res)
    {
        if(ds.size()==k)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=id;i<=n;i++)
        {
            ds.add(i);
            back(n,k,i+1,ds,res);
            ds.remove(ds.size()-1);
        }
    }
}